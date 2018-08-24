package cn.linkpal.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {


    public static String getPreMonthDate(int month)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.setTime(new Date());
        ca.add(Calendar.MONTH, -1*month);
        Date m = ca.getTime();
        String mon = format.format(m);
        return mon;
    }

    public static String dateFormat(String s)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss.SSSXXX");  //yyyy-MM-dd'T'HH:mm:ss.SSSZ
        Date  date = null;
        try {
            date = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat df1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss", Locale.UK);
        System.out.println(date);
       return df1.format(date);
    }
}
