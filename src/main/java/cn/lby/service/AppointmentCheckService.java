package cn.lby.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.lby.util.CookieUtil;
import cn.lby.vo.AppointmentCheckVO;
import cn.lby.vo.SaveAppointmentCheckVO;

public interface AppointmentCheckService {
	// cookie 较验
	public boolean check(CookieUtil cookieUtil);
	
	// 获取市场活动信息和活动所在城市
	public List<Map<String,String>> getMarketActivities();
	
	// 根据市场活动 Id 获取当前市场活动下成功预约的客户 
	public List<AppointmentCheckVO> getCustomers(String marketActivityId, Integer customerStatus, String condition, String createTime);

	// 保存新的客户信息
	public boolean saveCustomer(SaveAppointmentCheckVO saveAppointmentCheckVO);

	// 为确定到店客户重新发送预约成功短信
	public boolean sendMessage(String marketActivityId, String customerId);

	// 向当前用用户发送手机验证码
	public boolean sendCode(String mobile);
	
	// 客服登录验证
	public boolean doLogin(String mobile, String dynamicNum, HttpServletRequest request, HttpServletResponse response);
}
