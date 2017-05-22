package cn.lby.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.lby.service.AppointmentCheckService;
import cn.lby.util.CookieUtil;
import cn.lby.vo.AppointmentCheckVO;
import cn.lby.vo.SaveAppointmentCheckVO;

@RestController
@RequestMapping("/appointmentCheck")
public class AppointmentCheckController {
	@Autowired
	HttpServletRequest  request;

	@Autowired
	HttpServletResponse response;

	@Autowired
	AppointmentCheckService appointmentCheckService;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	
	@RequestMapping(value="/check",method=RequestMethod.GET)
	public String check(){
		CookieUtil cookieUtil = new CookieUtil(request, response);
		if (appointmentCheckService.check(cookieUtil)) {
			return "accessible";
		} else {
			return "forbidden";
		}
	}
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public List<Map<String,String>> getMarketActivities(){
		return appointmentCheckService.getMarketActivities();
	}
	
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public List<AppointmentCheckVO> getCustomers(String marketActivityId, Integer customerStatus, String condition, String createTime){
    	return appointmentCheckService.getCustomers(marketActivityId, customerStatus, condition, createTime);
	}
	
	@RequestMapping(value="/saveCustomer",method=RequestMethod.POST)
	public String saveCustomer(@RequestBody SaveAppointmentCheckVO saveAppointmentCheckVO){
		boolean isSaved = appointmentCheckService.saveCustomer(saveAppointmentCheckVO);
		if (isSaved) {
			return "success";
		} else {
			return "failed";
		}
	}

	@RequestMapping(value="/sendMessage",method=RequestMethod.GET)
    public String sendMessage(String marketActivityId, String customerId) {
		boolean isSend = appointmentCheckService.sendMessage(marketActivityId, customerId);
		if (isSend) {
			return "success";
		} else {
			return "failed";
		}
	}
	
	@RequestMapping(value="/sendCode",method=RequestMethod.POST)
	public String sendCode(@RequestBody String mobile) {
		boolean isSend = appointmentCheckService.sendCode(mobile);
		if (isSend) {
			return "success";
		} else {
			return "failed";
		}
	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
    public String doLogin(@RequestBody JSONObject jsonObject) {
		String mobile = (String)jsonObject.get("mobile");
		String dynamicNum = (String)jsonObject.get("dynamicNum");
		
		boolean islegal = appointmentCheckService.doLogin(mobile, dynamicNum, request, response);
		if (islegal) {
			return "success";
		} else {
			return "failed";
		}
	}
	
}
