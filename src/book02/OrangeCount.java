package book02;

import java.util.Scanner;

public class OrangeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("오랜지 갯수를 입력하세요: ");
        int num = sc.nextInt();
        int orangeBoxCount = 0;
        int orangeCount = 0;

        if (num != 0 && num > 0) {
            orangeBoxCount = num / 10;
            orangeCount = num % 10;
        }

        System.out.println(orangeBoxCount+"박스가 필요하고 "+orangeCount+"개가 남습니다.");
    }
}
