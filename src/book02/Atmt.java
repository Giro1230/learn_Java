package book02;

import java.util.Scanner;

public class Atmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X : ");
        int x = sc.nextInt();
        System.out.print("Y : ");
        int y = sc.nextInt();

        System.out.println("두 수의 합 : " + (x + y));
        System.out.println("두 수의 차 : " + (x - y));
        System.out.println("두 수의 곱 : " + (x * y));
        System.out.println("두 수의 평균 : " + (double)((x + y) / 2));
        System.out.println("큰 수 : " + ((x > y) ? x : y));
        System.out.println("작은 수 : " + ((y > x) ? x : y));


    }
}
