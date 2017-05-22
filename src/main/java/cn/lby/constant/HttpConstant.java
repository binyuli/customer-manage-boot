package cn.lby.constant;

public class HttpConstant {
	public static final int CODE_400 = 400;
	public static final int CODE_401 = 401;
	public static final int CODE_403 = 403;
	public static final int CODE_404 = 404;
	public static final int CODE_500 = 500;

	public static final int EXPIRESUTC = 7;// 天/单位
	public static final int REFRESHTOKENEXPIRESUTC = 2;//天/单位
	public static final int COOOKIEEXPIRESUTC = 24 * 60 * 60 * 700;
	public static final int EXPIRESUTC_SECOND = 24 * 60 * 60 * EXPIRESUTC;
	public static final int REFRESHTOKENEXPIRESUTC_SECOND = 24 * 60 * 60 * REFRESHTOKENEXPIRESUTC;
	
	public static final String SEG = "_";
	public static final String COOKIE_NAME = "sdt.dmc.cookie";
	public static final String APPOINTMENT_COOKIE_ADMIN = "sdt.dmc.appointment_admin";
	public static final String APPOINTMENT_COOKIE_MOBILE = "sdt.dmc.appointment_mobile";
	public static final String COOKIE_NAME_IDCARD = "sdt.idcard.cookie";
	
}
