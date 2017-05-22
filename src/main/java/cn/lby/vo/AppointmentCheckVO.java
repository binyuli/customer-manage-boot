package cn.lby.vo;

import java.util.Date;

public class AppointmentCheckVO {
//	[
//	    {
//	        "customerId": [string],             // 客户 Id (修改客户信息时传参用)
//	        "customerName": [string],           // 客户姓名
//	        "customerGender": [number],         // 客户性别 (0: 男; 1: 女)
//	        "customerMobile": [string],         // 客户手机号
//	        "appointmentDate": [date],        	// 试驾时间
//			"createTime": [string],             // 留档时间
//	        "giftName": [string],               // 礼品名称
//			"customerComment": [string],		// 用户备注信息
//	        "customerStatus": [number]         	// 状态 (0: 未回访; 1: 确定到店; 2: 确定不到店; 3: 不确定是否到店)
//	    }
//	]

	private String customerId;
	private String customerName;
	private Integer customerGender;
	private String customerMobile;
	private Date appointmentDate;
	private Date createTime;
	private String giftName;
	private String customerComment;
	private Integer customerStatus;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(Integer customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public String getCustomerComment() {
		return customerComment;
	}
	public void setCustomerComment(String customerComment) {
		this.customerComment = customerComment;
	}
	public Integer getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(Integer customerStatus) {
		this.customerStatus = customerStatus;
	}
	
}
