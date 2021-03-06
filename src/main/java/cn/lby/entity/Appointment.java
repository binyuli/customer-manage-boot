package cn.lby.entity;

import java.util.Date;

public class Appointment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.code
	 * @mbggenerated
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.market_activity_id
	 * @mbggenerated
	 */
	private String marketActivityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.market_activity_code
	 * @mbggenerated
	 */
	private String marketActivityCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.market_activity_start
	 * @mbggenerated
	 */
	private Date marketActivityStart;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.market_activity_end
	 * @mbggenerated
	 */
	private Date marketActivityEnd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.customer_id
	 * @mbggenerated
	 */
	private String customerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.customer_name
	 * @mbggenerated
	 */
	private String customerName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.customer_mobile
	 * @mbggenerated
	 */
	private String customerMobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.customer_email
	 * @mbggenerated
	 */
	private String customerEmail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.appointment_date
	 * @mbggenerated
	 */
	private Date appointmentDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.vehicle_model_id
	 * @mbggenerated
	 */
	private String vehicleModelId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.vehicle_model_code
	 * @mbggenerated
	 */
	private String vehicleModelCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.vehicle_model_name
	 * @mbggenerated
	 */
	private String vehicleModelName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.dealer_id
	 * @mbggenerated
	 */
	private String dealerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.dealer_code
	 * @mbggenerated
	 */
	private String dealerCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.dealer_name
	 * @mbggenerated
	 */
	private String dealerName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.sale_consultant_id
	 * @mbggenerated
	 */
	private String saleConsultantId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.sale_consultant_name
	 * @mbggenerated
	 */
	private String saleConsultantName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.sale_consultant_mobile
	 * @mbggenerated
	 */
	private String saleConsultantMobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.info_source
	 * @mbggenerated
	 */
	private Integer infoSource;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.gift_id
	 * @mbggenerated
	 */
	private String giftId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.gift_code
	 * @mbggenerated
	 */
	private String giftCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.gift_name
	 * @mbggenerated
	 */
	private String giftName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.status
	 * @mbggenerated
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.create_time
	 * @mbggenerated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.channel
	 * @mbggenerated
	 */
	private String channel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.cookie
	 * @mbggenerated
	 */
	private String cookie;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.customer_gender
	 * @mbggenerated
	 */
	private Integer customerGender;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.customer_status
	 * @mbggenerated
	 */
	private Integer customerStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column appointment.customer_comment
	 * @mbggenerated
	 */
	private String customerComment;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.id
	 * @return  the value of appointment.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.id
	 * @param id  the value for appointment.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.code
	 * @return  the value of appointment.code
	 * @mbggenerated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.code
	 * @param code  the value for appointment.code
	 * @mbggenerated
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.market_activity_id
	 * @return  the value of appointment.market_activity_id
	 * @mbggenerated
	 */
	public String getMarketActivityId() {
		return marketActivityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.market_activity_id
	 * @param marketActivityId  the value for appointment.market_activity_id
	 * @mbggenerated
	 */
	public void setMarketActivityId(String marketActivityId) {
		this.marketActivityId = marketActivityId == null ? null
				: marketActivityId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.market_activity_code
	 * @return  the value of appointment.market_activity_code
	 * @mbggenerated
	 */
	public String getMarketActivityCode() {
		return marketActivityCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.market_activity_code
	 * @param marketActivityCode  the value for appointment.market_activity_code
	 * @mbggenerated
	 */
	public void setMarketActivityCode(String marketActivityCode) {
		this.marketActivityCode = marketActivityCode == null ? null
				: marketActivityCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.market_activity_start
	 * @return  the value of appointment.market_activity_start
	 * @mbggenerated
	 */
	public Date getMarketActivityStart() {
		return marketActivityStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.market_activity_start
	 * @param marketActivityStart  the value for appointment.market_activity_start
	 * @mbggenerated
	 */
	public void setMarketActivityStart(Date marketActivityStart) {
		this.marketActivityStart = marketActivityStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.market_activity_end
	 * @return  the value of appointment.market_activity_end
	 * @mbggenerated
	 */
	public Date getMarketActivityEnd() {
		return marketActivityEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.market_activity_end
	 * @param marketActivityEnd  the value for appointment.market_activity_end
	 * @mbggenerated
	 */
	public void setMarketActivityEnd(Date marketActivityEnd) {
		this.marketActivityEnd = marketActivityEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.customer_id
	 * @return  the value of appointment.customer_id
	 * @mbggenerated
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.customer_id
	 * @param customerId  the value for appointment.customer_id
	 * @mbggenerated
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId == null ? null : customerId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.customer_name
	 * @return  the value of appointment.customer_name
	 * @mbggenerated
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.customer_name
	 * @param customerName  the value for appointment.customer_name
	 * @mbggenerated
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName == null ? null : customerName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.customer_mobile
	 * @return  the value of appointment.customer_mobile
	 * @mbggenerated
	 */
	public String getCustomerMobile() {
		return customerMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.customer_mobile
	 * @param customerMobile  the value for appointment.customer_mobile
	 * @mbggenerated
	 */
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile == null ? null : customerMobile
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.customer_email
	 * @return  the value of appointment.customer_email
	 * @mbggenerated
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.customer_email
	 * @param customerEmail  the value for appointment.customer_email
	 * @mbggenerated
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail == null ? null : customerEmail
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.appointment_date
	 * @return  the value of appointment.appointment_date
	 * @mbggenerated
	 */
	public Date getAppointmentDate() {
		return appointmentDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.appointment_date
	 * @param appointmentDate  the value for appointment.appointment_date
	 * @mbggenerated
	 */
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.vehicle_model_id
	 * @return  the value of appointment.vehicle_model_id
	 * @mbggenerated
	 */
	public String getVehicleModelId() {
		return vehicleModelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.vehicle_model_id
	 * @param vehicleModelId  the value for appointment.vehicle_model_id
	 * @mbggenerated
	 */
	public void setVehicleModelId(String vehicleModelId) {
		this.vehicleModelId = vehicleModelId == null ? null : vehicleModelId
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.vehicle_model_code
	 * @return  the value of appointment.vehicle_model_code
	 * @mbggenerated
	 */
	public String getVehicleModelCode() {
		return vehicleModelCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.vehicle_model_code
	 * @param vehicleModelCode  the value for appointment.vehicle_model_code
	 * @mbggenerated
	 */
	public void setVehicleModelCode(String vehicleModelCode) {
		this.vehicleModelCode = vehicleModelCode == null ? null
				: vehicleModelCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.vehicle_model_name
	 * @return  the value of appointment.vehicle_model_name
	 * @mbggenerated
	 */
	public String getVehicleModelName() {
		return vehicleModelName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.vehicle_model_name
	 * @param vehicleModelName  the value for appointment.vehicle_model_name
	 * @mbggenerated
	 */
	public void setVehicleModelName(String vehicleModelName) {
		this.vehicleModelName = vehicleModelName == null ? null
				: vehicleModelName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.dealer_id
	 * @return  the value of appointment.dealer_id
	 * @mbggenerated
	 */
	public String getDealerId() {
		return dealerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.dealer_id
	 * @param dealerId  the value for appointment.dealer_id
	 * @mbggenerated
	 */
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId == null ? null : dealerId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.dealer_code
	 * @return  the value of appointment.dealer_code
	 * @mbggenerated
	 */
	public String getDealerCode() {
		return dealerCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.dealer_code
	 * @param dealerCode  the value for appointment.dealer_code
	 * @mbggenerated
	 */
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode == null ? null : dealerCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.dealer_name
	 * @return  the value of appointment.dealer_name
	 * @mbggenerated
	 */
	public String getDealerName() {
		return dealerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.dealer_name
	 * @param dealerName  the value for appointment.dealer_name
	 * @mbggenerated
	 */
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName == null ? null : dealerName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.sale_consultant_id
	 * @return  the value of appointment.sale_consultant_id
	 * @mbggenerated
	 */
	public String getSaleConsultantId() {
		return saleConsultantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.sale_consultant_id
	 * @param saleConsultantId  the value for appointment.sale_consultant_id
	 * @mbggenerated
	 */
	public void setSaleConsultantId(String saleConsultantId) {
		this.saleConsultantId = saleConsultantId == null ? null
				: saleConsultantId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.sale_consultant_name
	 * @return  the value of appointment.sale_consultant_name
	 * @mbggenerated
	 */
	public String getSaleConsultantName() {
		return saleConsultantName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.sale_consultant_name
	 * @param saleConsultantName  the value for appointment.sale_consultant_name
	 * @mbggenerated
	 */
	public void setSaleConsultantName(String saleConsultantName) {
		this.saleConsultantName = saleConsultantName == null ? null
				: saleConsultantName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.sale_consultant_mobile
	 * @return  the value of appointment.sale_consultant_mobile
	 * @mbggenerated
	 */
	public String getSaleConsultantMobile() {
		return saleConsultantMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.sale_consultant_mobile
	 * @param saleConsultantMobile  the value for appointment.sale_consultant_mobile
	 * @mbggenerated
	 */
	public void setSaleConsultantMobile(String saleConsultantMobile) {
		this.saleConsultantMobile = saleConsultantMobile == null ? null
				: saleConsultantMobile.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.info_source
	 * @return  the value of appointment.info_source
	 * @mbggenerated
	 */
	public Integer getInfoSource() {
		return infoSource;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.info_source
	 * @param infoSource  the value for appointment.info_source
	 * @mbggenerated
	 */
	public void setInfoSource(Integer infoSource) {
		this.infoSource = infoSource;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.gift_id
	 * @return  the value of appointment.gift_id
	 * @mbggenerated
	 */
	public String getGiftId() {
		return giftId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.gift_id
	 * @param giftId  the value for appointment.gift_id
	 * @mbggenerated
	 */
	public void setGiftId(String giftId) {
		this.giftId = giftId == null ? null : giftId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.gift_code
	 * @return  the value of appointment.gift_code
	 * @mbggenerated
	 */
	public String getGiftCode() {
		return giftCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.gift_code
	 * @param giftCode  the value for appointment.gift_code
	 * @mbggenerated
	 */
	public void setGiftCode(String giftCode) {
		this.giftCode = giftCode == null ? null : giftCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.gift_name
	 * @return  the value of appointment.gift_name
	 * @mbggenerated
	 */
	public String getGiftName() {
		return giftName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.gift_name
	 * @param giftName  the value for appointment.gift_name
	 * @mbggenerated
	 */
	public void setGiftName(String giftName) {
		this.giftName = giftName == null ? null : giftName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.status
	 * @return  the value of appointment.status
	 * @mbggenerated
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.status
	 * @param status  the value for appointment.status
	 * @mbggenerated
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.create_time
	 * @return  the value of appointment.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.create_time
	 * @param createTime  the value for appointment.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.channel
	 * @return  the value of appointment.channel
	 * @mbggenerated
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.channel
	 * @param channel  the value for appointment.channel
	 * @mbggenerated
	 */
	public void setChannel(String channel) {
		this.channel = channel == null ? null : channel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.cookie
	 * @return  the value of appointment.cookie
	 * @mbggenerated
	 */
	public String getCookie() {
		return cookie;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.cookie
	 * @param cookie  the value for appointment.cookie
	 * @mbggenerated
	 */
	public void setCookie(String cookie) {
		this.cookie = cookie == null ? null : cookie.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.customer_gender
	 * @return  the value of appointment.customer_gender
	 * @mbggenerated
	 */
	public Integer getCustomerGender() {
		return customerGender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.customer_gender
	 * @param customerGender  the value for appointment.customer_gender
	 * @mbggenerated
	 */
	public void setCustomerGender(Integer customerGender) {
		this.customerGender = customerGender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.customer_status
	 * @return  the value of appointment.customer_status
	 * @mbggenerated
	 */
	public Integer getCustomerStatus() {
		return customerStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.customer_status
	 * @param customerStatus  the value for appointment.customer_status
	 * @mbggenerated
	 */
	public void setCustomerStatus(Integer customerStatus) {
		this.customerStatus = customerStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column appointment.customer_comment
	 * @return  the value of appointment.customer_comment
	 * @mbggenerated
	 */
	public String getCustomerComment() {
		return customerComment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column appointment.customer_comment
	 * @param customerComment  the value for appointment.customer_comment
	 * @mbggenerated
	 */
	public void setCustomerComment(String customerComment) {
		this.customerComment = customerComment == null ? null : customerComment
				.trim();
	}
}