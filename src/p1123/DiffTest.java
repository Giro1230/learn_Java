package p1123;

import java.util.Calendar;
import java.util.Date;

public class DiffTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();

        Calendar c = Calendar.getInstance();
        c.set(2022,10,23, 0,0,0);

        Calendar c2 = Calendar.getInstance();
        c2.set(2022, 10, 23,0,0,0);

        d1 = c.getTime();
        d2 = c2.getTime();

        long now = d1.getTime();
        long start = d2.getTime();

        long diff = now - start;

        long sec = diff/ 1000;
        long min = diff / (1000*60);
        long hour = diff/ (1000*60*60);
        long day = sec/ (24 * 60 *60);

        System.out.println(d1.getTime());
        System.out.println(d2.getTime());
        System.out.println(diff);

        System.out.println(sec + "초 차이");
        System.out.println(min + "분 차이");
        System.out.println(hour + "시간 차이");
        System.out.println(day + " 일 차이");
    }
}
