package p1115;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
//        StringTokenizer st = new StringTokenizer("홍길동, 장화, 홍련, 콩쥐, 팥쥐",(", ")); // 마지막 boolean 에서 'true' 를 넣어 주면 split 된 "/"까지 문자열로 받아 들인다.
//
//        while (st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }

        String str = "2+3+5+66+88+323";
        StringTokenizer st2 = new StringTokenizer(str, "+");
        int sum = 0;

        while (st2.hasMoreTokens()) {
            sum += Integer.parseInt(st2.nextToken());
        }

        System.out.println(sum);
    }
}
