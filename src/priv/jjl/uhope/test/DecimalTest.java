package priv.jjl.uhope.test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DecimalTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	DecimalFormat df = new DecimalFormat("###.00");
        df.setRoundingMode(RoundingMode.FLOOR);
        float eventClosureRate = (float)3/3*100;
        float logFinishingRate = (float)2/3*100;
        String eventClosureRateStr = df.format(eventClosureRate);
        String logFinishingRateStr = df.format(logFinishingRate);
        System.out.println("-----eventClosureRateStr: "+eventClosureRateStr);
        System.out.println("-----logFinishingRateStr: "+logFinishingRateStr);
        
//        Calendar calendar=Calendar.getInstance();
//        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
//        int month=calendar.get(Calendar.MONTH);
//        int year = calendar.get(Calendar.YEAR);
//        System.out.println("month: "+month);
//        System.out.println("year: "+year);
        int season=(3+1+3)/3;
        System.out.println("当前是"+season+"季度");
        
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));    //获取东八区时间

        int year = c.get(Calendar.YEAR);    //获取年
        int month = c.get(Calendar.MONTH) + 1;   //获取月份，0表示1月份
        int day = c.get(Calendar.DAY_OF_MONTH);    //获取当前天数
        int first = c.getActualMinimum(c.DAY_OF_MONTH);    //获取本月最小天数
        int last = c.getActualMaximum(c.DAY_OF_MONTH);    //获取本月最大天数
        int time = c.get(Calendar.HOUR_OF_DAY);       //获取当前小时
        int min = c.get(Calendar.MINUTE);          //获取当前分钟
        int xx = c.get(Calendar.SECOND);          //获取当前秒

       c.set(Calendar.MONTH, 0);
       month = c.get(Calendar.MONTH);

        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String curDate = s.format(c.getTime());  //当前日期
        System.out.println("当前时间："+year + "-" + month + "-"+ day + " "+time + ":" + min +":" + xx);
        System.out.println("第一天和最后天：" + first +"," + last);

        System.out.println("当前日期curDate====：" + curDate);
        
        Integer villageId = null, townId = null,countyId = null,cityId = 2,provinceId = 1;
        
        Integer val = villageId == null ? townId == null ? countyId == null ? cityId == null ? provinceId == null ? 0
                : 1
                : 2
                : 3
                : 4
                : 5;
        System.out.println("-----val------"+val);
        
    }

}
