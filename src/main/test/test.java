import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test {

    @Test
    public void t()
    {
        try {

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");  //yyyy-MM-dd'T'HH:mm:ss.SSSZ
            Date  date = df.parse("2018-08-07T11:06:44+08:00");
            SimpleDateFormat df1 = new SimpleDateFormat ("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
            Date date1 =  df1.parse(date.toString());
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
