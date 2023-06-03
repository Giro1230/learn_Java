package chap01;

import java.util.Scanner;

public class ArrayEx03 {
    public static void screenPrint() {
        // 좌석번호 출력
        System.out.println("========== Busan Air Seat ==========");
        System.out.println("1\t2\t3\t4\t5");
        System.out.println("6\t7\t8\t9\t10");
    }
    public static int getNumber() {
        // 좌석번호 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice seat Number >> ");
        int choiceSeat = sc.nextInt();

        return choiceSeat;
    }
    public static void compare() {
        int cnt = 0;
        int[] seat = new int[10];

        while(cnt < seat.length){
            // 좌석 전체 보여주기
            screenPrint();
            // 좌석 번호 입력 받는 함수 호출 및 변부 초기화
            int num = getNumber();
            // 좌석 예약 기능
            if (seat[num-1] == 0) {
                System.out.println("You're choice seat number "+num);
                seat[num-1] = 1;
                cnt++;
            } else {
                System.out.println("I'm sorry, There's a customer who chose a seat first.");
            }

            if (num > seat.length || num <= 0) {
                System.out.println("No, one more input number");
            }
            System.out.println();
        }
        System.out.println("Thank You!!");
    }
    public static void main(String[] args) {
        compare();
    }
}
