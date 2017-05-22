package cn.lby.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lby.constant.BaseConstant;
import cn.lby.constant.HttpConstant;
import cn.lby.entity.Appointment;
import cn.lby.entity.AppointmentExample;
import cn.lby.entity.AppointmentLoginManage;
import cn.lby.entity.AppointmentLoginManageExample;
import cn.lby.entity.Customer;
import cn.lby.entity.MarketActivity;
import cn.lby.entity.MarketActivityExample;
import cn.lby.mapper.AppointmentLoginManageMapper;
import cn.lby.mapper.AppointmentMapper;
import cn.lby.mapper.CustomerMapper;
import cn.lby.mapper.MarketActivityMapper;
import cn.lby.service.AppointmentCheckService;
import cn.lby.util.CookieUtil;
import cn.lby.util.DateUtil;
import cn.lby.util.Md5Util;
import cn.lby.util.PropertiesUtil;
import cn.lby.util.RandomCodeUtils;
import cn.lby.vo.AppointmentCheckVO;
import cn.lby.vo.SaveAppointmentCheckVO;

@Service("appointmentCheckService")
public class AppointmentCheckServiceImpl implements AppointmentCheckService {

	private static Logger logger = Logger.getLogger(AppointmentCheckServiceImpl.class);

	@Autowired
	private MarketActivityMapper marketActivityMapper;
	@Autowired
	private AppointmentMapper appointmentMapper;
	@Autowired
	private CustomerMapper customerMapper;
//	@Autowired
//	private MessageService messageService;
	@Autowired
	private AppointmentLoginManageMapper appointmentLoginManageMapper;
//	@Autowired
//	private SmsCodeService smsCodeService;
	
	@Override
	public boolean check(CookieUtil cookieUtil) {
		// 检验用户 cookie (一个是管理员的一个是手机号白名单的)
		if (cookieUtil.getCookie(HttpConstant.APPOINTMENT_COOKIE_ADMIN) != null) {
			String adminToken = PropertiesUtil.getInstanse().getStringByProperties("appointment_check_admin", "server.properties");
			String cookieToken = cookieUtil.getCookieValue(HttpConstant.APPOINTMENT_COOKIE_ADMIN);
			if (adminToken.equals(cookieToken)) {
				return true;
			}
		} else if (cookieUtil.getCookie(HttpConstant.APPOINTMENT_COOKIE_MOBILE) != null) {
			String cookieToken = cookieUtil.getCookieValue(HttpConstant.APPOINTMENT_COOKIE_MOBILE);
			AppointmentLoginManageExample example = new AppointmentLoginManageExample();
			example.createCriteria().andTokenEqualTo(cookieToken);
			List<AppointmentLoginManage> appointmentLoginManages = appointmentLoginManageMapper.selectByExample(example);
			if (appointmentLoginManages != null && appointmentLoginManages.size() != 0) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public List<Map<String, String>> getMarketActivities() {
		MarketActivityExample example = new MarketActivityExample();
		example.createCriteria().andStatusEqualTo(BaseConstant.BASE_DATA_STATUS_VALID);
		List<MarketActivity> activities = marketActivityMapper.selectByExample(example);

		List<Map<String,String>> resultMapList = new ArrayList<Map<String,String>>();
		for (MarketActivity activity : activities) {
			Map<String, String> resultMap = new HashMap<String, String>();
			resultMap.put("marketActivityId", activity.getId());
			resultMap.put("marketActivityAddress", activity.getActivityAddress());
			resultMap.put("marketActivityTime", activity.getActivityTime());
			resultMap.put("city", activity.getCityName());
			resultMapList.add(resultMap);
		}

		return resultMapList;
	}

	@Override
	public List<AppointmentCheckVO> getCustomers(String marketActivityId, Integer customerStatus, String condition, String createTime) {
		AppointmentExample example = new AppointmentExample();
		
		// 构造创建日期的开始时间与结束时间
		Date startTime = null;
		Date endTime = null;
		if (createTime != null && !(createTime.trim().isEmpty())) {
			Date currentDate = DateUtil.stringToDate(createTime);
			startTime = DateUtil.startOfCurrentDay(currentDate);
			endTime = DateUtil.endOfCurrentDay(currentDate);
		}
		
		// 约束1：市场活动、客户状态、客户手机号、起止时间
		AppointmentExample.Criteria criteria = example.createCriteria().andStatusEqualTo(BaseConstant.APPOINTMENT_STATUS_NEW);
		// 约束2：市场活动、客户状态、客户姓名、起止时间
		AppointmentExample.Criteria criteria2 = example.createCriteria().andStatusEqualTo(BaseConstant.APPOINTMENT_STATUS_NEW);
		if (marketActivityId != null) {
			criteria.andMarketActivityIdEqualTo(marketActivityId);
			criteria2.andMarketActivityIdEqualTo(marketActivityId);
		}
		if (customerStatus != null) {
			criteria.andCustomerStatusEqualTo(customerStatus);
			criteria2.andCustomerStatusEqualTo(customerStatus);
		}
		if (condition != null && !(condition.trim().isEmpty())) {
			String nameOrMobile = condition.trim();
			criteria.andCustomerMobileEqualTo(nameOrMobile);
			criteria2.andCustomerNameLike("%" + nameOrMobile + "%");
		}
		if (startTime != null && endTime != null ) {
			criteria.andCreateTimeBetween(startTime, endTime);
			criteria2.andCreateTimeBetween(startTime, endTime);
		}

		// select * from Appointment where MarketActivityId = ? and customerStatus = ? and (CustomerMobile=? or CustomerName like ?)
		example.or(criteria2);
		List<Appointment> appointments = appointmentMapper.selectByExampleWithBLOBs(example);	// 注意这里调的方法(customer_comment是text类型，所以要调这个方法才能查出相应数据)
		
		List<AppointmentCheckVO> appointmentResultList = new ArrayList<AppointmentCheckVO>();
		for (Appointment appointment : appointments) {
			AppointmentCheckVO appointmentCheckVO = new AppointmentCheckVO();
			appointmentCheckVO.setCustomerId(appointment.getCustomerId());
			appointmentCheckVO.setCustomerName(appointment.getCustomerName());
			appointmentCheckVO.setCustomerGender(appointment.getCustomerGender());
			appointmentCheckVO.setCustomerMobile(appointment.getCustomerMobile());
			appointmentCheckVO.setAppointmentDate(appointment.getAppointmentDate());
			appointmentCheckVO.setCreateTime(appointment.getCreateTime());
			appointmentCheckVO.setGiftName(appointment.getGiftName());
			appointmentCheckVO.setCustomerComment(appointment.getCustomerComment());
			appointmentCheckVO.setCustomerStatus(appointment.getCustomerStatus());
			appointmentResultList.add(appointmentCheckVO);
		}

		return appointmentResultList;
	}

	@Override
	public boolean sendMessage(String marketActivityId, String customerId) {
		Customer customer = customerMapper.selectByPrimaryKey(customerId);
		MarketActivity marketActivity = marketActivityMapper.selectByPrimaryKey(marketActivityId);

		if (customer == null || marketActivity == null) {
			logger.debug("找不到目标客户，短信发送失败！");;
			return false;
		} else {
//			messageService.sendMessage(customer, marketActivity, BaseConstant.SMS_TYPE_APPOINTMENT_SUCCESS);
			return true;
		}
	}

	@Override
	@Transactional
	public boolean saveCustomer(SaveAppointmentCheckVO saveAppointmentCheckVO) {
		// 不给客户 Id 就不进行相关操作(同时也是因为example在添加查询条件的时候不能给 null 值)
		if (saveAppointmentCheckVO.getCustomerId() == null || saveAppointmentCheckVO.getMarketActivityId() == null) {
			logger.debug("请给出用户 Id 和市场活动 Id!");
			return false;
		}
		if (saveAppointmentCheckVO.getCustomerName().trim().isEmpty()) {
			logger.debug("客户姓名不能为空!");
			return false;
		}
		
		AppointmentExample appointmentExample = new AppointmentExample();
		appointmentExample.createCriteria().andCustomerIdEqualTo(saveAppointmentCheckVO.getCustomerId()).andStatusEqualTo(BaseConstant.APPOINTMENT_STATUS_NEW)
			.andMarketActivityIdEqualTo(saveAppointmentCheckVO.getMarketActivityId());
		List<Appointment> appointments = appointmentMapper.selectByExample(appointmentExample);
		Customer customer = customerMapper.selectByPrimaryKey(saveAppointmentCheckVO.getCustomerId());
		
		if (appointments == null || appointments.size() == 0 || customer == null) {
			logger.debug("找不到目标客户，更新客户信息失败！");
			return false;
		} else {
			// 更新预约单 (预约单中一个客户唯一对应一条数据，所以这里直接拿到结果集中的第一个作处理)
			Appointment appointment = appointments.get(0);
			appointment.setCustomerName(saveAppointmentCheckVO.getCustomerName().trim());
			appointment.setCustomerGender(saveAppointmentCheckVO.getCustomerGender());
			appointment.setCustomerComment(saveAppointmentCheckVO.getCustomerComment());
			appointment.setAppointmentDate(DateUtil.stringToDateIn(saveAppointmentCheckVO.getAppointmentDate()));
			appointment.setCustomerStatus(saveAppointmentCheckVO.getCustomerStatus());			
			int appointmentUpdateResult = appointmentMapper.updateByPrimaryKeySelective(appointment);
			
			// 更新 customer 表
			customer.setName(saveAppointmentCheckVO.getCustomerName());
			customer.setGender(saveAppointmentCheckVO.getCustomerGender());
			int customerUpdateResult = customerMapper.updateByPrimaryKeySelective(customer);
			
			if (appointmentUpdateResult > 0 && customerUpdateResult > 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public boolean sendCode(String mobile) {
		// 首先检查 mobile 是否为空或中间是否带空字符(其实前端用正则做了电话号码合法性检验)
		if (StringUtils.isBlank(mobile)) {
			return false;
		}

		// 到管理员名单中去查该号码，如果存在则发送短信验证码 
		AppointmentLoginManage appointmentLoginManage = appointmentLoginManageMapper.selectByPrimaryKey(mobile);
		if (appointmentLoginManage != null) {
			String msg = "【大众中国】您的验证码%s,请尽快完成验证(此验证码%s分钟内有效)";
			String random = RandomCodeUtils.getRandomSixNumber();
			String text = String.format(msg, random, "3");

			// 若发送成功则将该验证码信息保存并设置有效时间为3分钟
//			if(messageService.send(mobile, text))
//			{
//				SmsCode smsCode = new SmsCode();
//				smsCode.setId(UUIDUtil.getOrigUUID());
//				smsCode.setMobile(mobile);
//				smsCode.setMsg(text);
//				smsCode.setCheckCode(random);
//				smsCode.setCreateDate(new Date());
//				smsCode.setIsUse(0);
//				smsCode.setExpireDate(System.currentTimeMillis() + 3 * 60 * 1000);
//				smsCodeService.save(smsCode);
//				return true;
//			}
		}

		return false;
	}

	@Override
	public boolean doLogin(String mobile, String dynamicNum, HttpServletRequest request, HttpServletResponse response) {
		if (StringUtils.isBlank(mobile) || StringUtils.isBlank(dynamicNum)) {
			return false;
		}

		// 先进行管理员登录较验
		String adminToken = PropertiesUtil.getInstanse().getStringByProperties("appointment_check_admin", "server.properties");
		if (adminToken.equals(Md5Util.parseStrToMd5L32(mobile + dynamicNum))) {
			// 种管理员 cookie
			CookieUtil cookieUtil = new CookieUtil(request, response, HttpConstant.EXPIRESUTC_SECOND);
			cookieUtil.addCookie(HttpConstant.APPOINTMENT_COOKIE_ADMIN, adminToken);
			
			return true;
		} else {
			// 如果不是管理员账户，则开始手机号验证
//			if (smsCodeService.checkCode(mobile, dynamicNum)) {
			if (true) {
				// 种手机号 cookie
				CookieUtil cookieUtil = new CookieUtil(request, response, HttpConstant.EXPIRESUTC_SECOND);
				cookieUtil.addCookie(HttpConstant.APPOINTMENT_COOKIE_MOBILE, Md5Util.parseStrToMd5L32(mobile));
				
				return true;
			}
		}
		
		return false;
	}
		
}
