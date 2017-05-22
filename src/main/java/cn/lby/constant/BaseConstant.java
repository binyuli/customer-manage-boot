package cn.lby.constant;

public final class BaseConstant {
	
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
    // 基础数据状态
    public static final int BASE_DATA_STATUS_VALID = 0; // 有效
    public static final int BASE_DATA_STATUS_EXPIRED = 1; // 无效/作废
    public static final int BASE_DATA_STATUS_FINISH = 2; // 无效/作废

    // 基础数据状态 true/false
    public static final int BASE_TRUE = 0; // True
    public static final int BASE_FALSE = 1; // False

    //预约单登记状态
    //0 新建
    //1 过期
    //2 完成试驾
    public static final int APPOINTMENT_STATUS_NEW=0;       
    public static final int APPOINTMENT_STATUS_EXPIRE=1;    
    public static final int APPOINTMENT_STATUS_COMPLETE=2;
}
