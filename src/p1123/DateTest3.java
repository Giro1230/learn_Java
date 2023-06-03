package p1123;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {
    public static void main(String[] args) throws ParseException {
        //  날짜를 문자열로 바꾸기(형식지정)
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String date = sdf.format(d);
        System.out.println(date);

        //  문자열을 날짜로 바꾸기
        String date2 = "2022년 11월 23일 11시 50분 31초";
        Date d2 = sdf.parse(date2);
        System.out.println(d2);

    }
}
