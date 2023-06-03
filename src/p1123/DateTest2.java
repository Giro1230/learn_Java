package p1123;

import java.sql.Timestamp;

public class DateTest2 {
    public static void main(String[] args) {
        java.util.Date d1 = new java.util.Date();
        java.sql.Date d2 = new java.sql.Date(d1.getTime());

        System.out.println(d1);
        System.out.println(d2);

        Timestamp t = new Timestamp(d1.getTime());
        System.out.println(t);
    }
}
