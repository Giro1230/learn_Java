package chap02;

import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("오늘의 일기");
        String s = sc.nextLine();
        System.out.print("월 : ");
        int num = sc.nextInt();
        System.out.print("요일 : ");
        String s2 = sc.next();

        System.out.printf("%3d월\t %s요일\n  내용\n%4s\n",num,s2,s);

        sc.close();
    }
}
