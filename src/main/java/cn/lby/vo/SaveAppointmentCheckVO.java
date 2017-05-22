package cn.lby.vo;


public class SaveAppointmentCheckVO {

//[
//    {
//		  "marketActivityId": [string],       // 市场活动 Id
//        "customerId": [string],             // 客户 Id (修改客户信息时传参用)
//        "customerName": [string],           // 客户姓名
//        "customerGender": [number],         // 客户性别 (0: 男; 1: 女)
//        "customerComment": [string],        // 用户备注信息
//        "appointmentDate": [string],        // 试驾时间
//        "customerStatus": [number]          // 状态 (0: 未确认; 1: 确定到店; 2: 确定不到店)
//    }
//]
	
	private String marketActivityId;
	private String customerId;
	private String customerName;
	private Integer customerGender;
	private String customerComment;
	private String appointmentDate;
	private Integer customerStatus;
	
	
	public String getMarketActivityId() {
		return marketActivityId;
	}
	public void setMarketActivityId(String marketActivityId) {
		this.marketActivityId = marketActivityId;
	}
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
	public String getCustomerComment() {
		return customerComment;
	}
	public void setCustomerComment(String customerComment) {
		this.customerComment = customerComment;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Integer getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(Integer customerStatus) {
		this.customerStatus = customerStatus;
	}
	
}
