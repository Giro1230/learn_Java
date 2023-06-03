package p1123;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        String date1 = "20221123";
        String date2 = "20220930";

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        /*Date 타입으로 변경*/

        Date d1 = format.parse(date1);
        Date d2 = format.parse(date2);

        long sec = (d1.getTime() - d2.getTime()) / 1000;
        long min = (d1.getTime() - d2.getTime()) / (1000 * 60);
        long hour = (d1.getTime() - d2.getTime()) / (1000*60*60);
        long day = hour / 24;

        System.out.println(sec + "초 차이");
        System.out.println(min + "분 차이");
        System.out.println(hour + "시간 차이");
        System.out.println(day + " 일 차이");
    }
}
