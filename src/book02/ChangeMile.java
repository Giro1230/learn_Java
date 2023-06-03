package book02;

import java.util.Scanner;

public class ChangeMile {
    public static double change(double mile){
        double changeMile = mile * 1.609;
        return changeMile;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("마일을 입력하세요: ");
        double mile = sc.nextDouble();

        System.out.println(mile + "마일은 " + change(mile) + "킬로미터 입니다.");
    }
}
