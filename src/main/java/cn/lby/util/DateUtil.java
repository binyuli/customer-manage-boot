package cn.lby.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//日期转字符串
	public static String dateToString(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		return str;
		
	}
	//日期转字符串
		public static String dateToStringNT(Date date){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			String str = sdf.format(date);
			return str;
			
		}
	//字符串转日期格式
	public static Date stringToDate(String str){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("日期转化出错");
			e.printStackTrace();
		}
		return date;
		
	}
	
	//字符串转日期格式
		public static Date stringToDateNS(String str){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date date=null;
			try {
				date = sdf.parse(str);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("日期转化出错");
				e.printStackTrace();
			}
			return date;
			
		}
	
	public static Date stringToDateIn(String str){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=null;
		try{
			date = sdf.parse(str);
		}catch(ParseException e){
			System.out.println("字符串转日期出错");
			e.printStackTrace();
		}
		return date;
		
	}
	
	
	//获取系统当前时间并且以特定格式输出
	public static java.sql.Timestamp getCurrentTime(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		Date d=null;
		try {
			d=stringToDateIn(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("日期转化出错");
			e.printStackTrace();
		}
		return new java.sql.Timestamp(d.getTime());
		
	}
	
    /**
     * 判断两个日期是否是同一天
     * 
     * @param Date
     *            date1
     * @param Date
     *            date2
     * @return
     */
    public static boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        boolean isSameMonth = isSameYear
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        boolean isSameDate = isSameMonth
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2
                        .get(Calendar.DAY_OF_MONTH);

        return isSameDate;
    }
    
    /**
     * 当天开始时间
     * @param Date date
     * @return Date
     */
    public static Date startOfCurrentDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 当天的结束时间
     * @param Date date
     * @return Date
     */
    public static Date endOfCurrentDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
    }

	
	public static void main(String[] args) throws ParseException {
		//System.out.println(stringToDateIn(dateToString(new Date())));
		//System.out.println(getCurrentTime());
		//System.out.println(getTimestamp(getCurrentTime()));
		//System.out.println(stringToDateIn("2016-11-08 19:20:00"));
		
		Date date1 = stringToDateIn("2016-11-08 19:20:00");
		Date date2 = stringToDateIn("2016-11-08 00:00:00");
		Date date3 = stringToDateIn("2016-11-09 19:20:00");
		
		System.out.println(isSameDate(date1, date2));
		System.out.println(isSameDate(date1, date3));
	}
}
