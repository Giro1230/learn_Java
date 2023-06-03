package p1123;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date();
//        System.out.println(d);

        long now = d.getTime();
//        System.out.println(now);

        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTimeInMillis());
//        System.out.println(c);

        c.set(2022, 10, 22);
        d = c.getTime();


        long today = d.getTime();
        Calendar c2 = Calendar.getInstance();
        c2.set(2022,8,30);

        long startDay = c2.getTimeInMillis();
        System.out.println(today);
        System.out.println(startDay);
        long diff = today - startDay;

        System.out.println(diff);
        System.out.println(diff/(1000*60*60*24));
    }
}
