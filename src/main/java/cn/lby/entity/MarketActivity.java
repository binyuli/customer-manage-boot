package cn.lby.entity;

import java.util.Date;

public class MarketActivity {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.code
	 * @mbggenerated
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.start_date
	 * @mbggenerated
	 */
	private Date startDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.end_date
	 * @mbggenerated
	 */
	private Date endDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.manufacturer_id
	 * @mbggenerated
	 */
	private String manufacturerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.manufacturer_name
	 * @mbggenerated
	 */
	private String manufacturerName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.brand_id
	 * @mbggenerated
	 */
	private String brandId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.brand_code
	 * @mbggenerated
	 */
	private String brandCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.brand_name
	 * @mbggenerated
	 */
	private String brandName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.status
	 * @mbggenerated
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.create_time
	 * @mbggenerated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.activity_address
	 * @mbggenerated
	 */
	private String activityAddress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.activity_time
	 * @mbggenerated
	 */
	private String activityTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.activity_contact_phone
	 * @mbggenerated
	 */
	private String activityContactPhone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.province_id
	 * @mbggenerated
	 */
	private String provinceId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.province_name
	 * @mbggenerated
	 */
	private String provinceName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.city_id
	 * @mbggenerated
	 */
	private String cityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.city_name
	 * @mbggenerated
	 */
	private String cityName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.district_id
	 * @mbggenerated
	 */
	private String districtId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.district_name
	 * @mbggenerated
	 */
	private String districtName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.appointment_time
	 * @mbggenerated
	 */
	private Integer appointmentTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.limit_time
	 * @mbggenerated
	 */
	private Integer limitTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_activity.detail_activity_address
	 * @mbggenerated
	 */
	private String detailActivityAddress;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.id
	 * @return  the value of market_activity.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.id
	 * @param id  the value for market_activity.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.code
	 * @return  the value of market_activity.code
	 * @mbggenerated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.code
	 * @param code  the value for market_activity.code
	 * @mbggenerated
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.name
	 * @return  the value of market_activity.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.name
	 * @param name  the value for market_activity.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.start_date
	 * @return  the value of market_activity.start_date
	 * @mbggenerated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.start_date
	 * @param startDate  the value for market_activity.start_date
	 * @mbggenerated
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.end_date
	 * @return  the value of market_activity.end_date
	 * @mbggenerated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.end_date
	 * @param endDate  the value for market_activity.end_date
	 * @mbggenerated
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.manufacturer_id
	 * @return  the value of market_activity.manufacturer_id
	 * @mbggenerated
	 */
	public String getManufacturerId() {
		return manufacturerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.manufacturer_id
	 * @param manufacturerId  the value for market_activity.manufacturer_id
	 * @mbggenerated
	 */
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId == null ? null : manufacturerId
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.manufacturer_name
	 * @return  the value of market_activity.manufacturer_name
	 * @mbggenerated
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.manufacturer_name
	 * @param manufacturerName  the value for market_activity.manufacturer_name
	 * @mbggenerated
	 */
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName == null ? null
				: manufacturerName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.brand_id
	 * @return  the value of market_activity.brand_id
	 * @mbggenerated
	 */
	public String getBrandId() {
		return brandId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.brand_id
	 * @param brandId  the value for market_activity.brand_id
	 * @mbggenerated
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId == null ? null : brandId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.brand_code
	 * @return  the value of market_activity.brand_code
	 * @mbggenerated
	 */
	public String getBrandCode() {
		return brandCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.brand_code
	 * @param brandCode  the value for market_activity.brand_code
	 * @mbggenerated
	 */
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode == null ? null : brandCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.brand_name
	 * @return  the value of market_activity.brand_name
	 * @mbggenerated
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.brand_name
	 * @param brandName  the value for market_activity.brand_name
	 * @mbggenerated
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName == null ? null : brandName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.status
	 * @return  the value of market_activity.status
	 * @mbggenerated
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.status
	 * @param status  the value for market_activity.status
	 * @mbggenerated
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.create_time
	 * @return  the value of market_activity.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.create_time
	 * @param createTime  the value for market_activity.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.activity_address
	 * @return  the value of market_activity.activity_address
	 * @mbggenerated
	 */
	public String getActivityAddress() {
		return activityAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.activity_address
	 * @param activityAddress  the value for market_activity.activity_address
	 * @mbggenerated
	 */
	public void setActivityAddress(String activityAddress) {
		this.activityAddress = activityAddress == null ? null : activityAddress
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.activity_time
	 * @return  the value of market_activity.activity_time
	 * @mbggenerated
	 */
	public String getActivityTime() {
		return activityTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.activity_time
	 * @param activityTime  the value for market_activity.activity_time
	 * @mbggenerated
	 */
	public void setActivityTime(String activityTime) {
		this.activityTime = activityTime == null ? null : activityTime.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.activity_contact_phone
	 * @return  the value of market_activity.activity_contact_phone
	 * @mbggenerated
	 */
	public String getActivityContactPhone() {
		return activityContactPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.activity_contact_phone
	 * @param activityContactPhone  the value for market_activity.activity_contact_phone
	 * @mbggenerated
	 */
	public void setActivityContactPhone(String activityContactPhone) {
		this.activityContactPhone = activityContactPhone == null ? null
				: activityContactPhone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.province_id
	 * @return  the value of market_activity.province_id
	 * @mbggenerated
	 */
	public String getProvinceId() {
		return provinceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.province_id
	 * @param provinceId  the value for market_activity.province_id
	 * @mbggenerated
	 */
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId == null ? null : provinceId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.province_name
	 * @return  the value of market_activity.province_name
	 * @mbggenerated
	 */
	public String getProvinceName() {
		return provinceName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.province_name
	 * @param provinceName  the value for market_activity.province_name
	 * @mbggenerated
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName == null ? null : provinceName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.city_id
	 * @return  the value of market_activity.city_id
	 * @mbggenerated
	 */
	public String getCityId() {
		return cityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.city_id
	 * @param cityId  the value for market_activity.city_id
	 * @mbggenerated
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId == null ? null : cityId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.city_name
	 * @return  the value of market_activity.city_name
	 * @mbggenerated
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.city_name
	 * @param cityName  the value for market_activity.city_name
	 * @mbggenerated
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.district_id
	 * @return  the value of market_activity.district_id
	 * @mbggenerated
	 */
	public String getDistrictId() {
		return districtId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.district_id
	 * @param districtId  the value for market_activity.district_id
	 * @mbggenerated
	 */
	public void setDistrictId(String districtId) {
		this.districtId = districtId == null ? null : districtId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.district_name
	 * @return  the value of market_activity.district_name
	 * @mbggenerated
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.district_name
	 * @param districtName  the value for market_activity.district_name
	 * @mbggenerated
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName == null ? null : districtName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.appointment_time
	 * @return  the value of market_activity.appointment_time
	 * @mbggenerated
	 */
	public Integer getAppointmentTime() {
		return appointmentTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.appointment_time
	 * @param appointmentTime  the value for market_activity.appointment_time
	 * @mbggenerated
	 */
	public void setAppointmentTime(Integer appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.limit_time
	 * @return  the value of market_activity.limit_time
	 * @mbggenerated
	 */
	public Integer getLimitTime() {
		return limitTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.limit_time
	 * @param limitTime  the value for market_activity.limit_time
	 * @mbggenerated
	 */
	public void setLimitTime(Integer limitTime) {
		this.limitTime = limitTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_activity.detail_activity_address
	 * @return  the value of market_activity.detail_activity_address
	 * @mbggenerated
	 */
	public String getDetailActivityAddress() {
		return detailActivityAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_activity.detail_activity_address
	 * @param detailActivityAddress  the value for market_activity.detail_activity_address
	 * @mbggenerated
	 */
	public void setDetailActivityAddress(String detailActivityAddress) {
		this.detailActivityAddress = detailActivityAddress == null ? null
				: detailActivityAddress.trim();
	}
}