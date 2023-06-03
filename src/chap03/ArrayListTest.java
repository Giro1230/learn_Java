package chap03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 선언식
        // ArrayList<> <-자료형 list <- 변수명 = new ArrayList<>() <-생성자;   => wrapper 타입이라고도 한다.

        ArrayList<String> list = new ArrayList<>();

        list.add("James"); // <- 배열의 맨 앞쪽부터 차례대로 들어가게 된다.
        list.add("Suzi");

        String x = list.get(0);
        System.out.println(x);

        int y = list.get(0).length(); // <- 메소드 체인이라고도 한다.
        System.out.println(y);

        // 해당 index 배열의 값을 지우고 뒤에 값이 있다면 당겨온다.
        list.remove(1);
    }
}
