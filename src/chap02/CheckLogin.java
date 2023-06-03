package chap02;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        String id = "admin";
        String pwd = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Id >> ");
        String userInputId = sc.next();
        
        System.out.print("Input pwd >> ");
        String userInputPwd = sc.next();

        for (int i = 0; i < 3; i++) {
            if (id.equals(userInputId) && pwd.equals(userInputPwd)) {
                System.out.println("Login");
            } else {
                System.out.println("No, Check your ID and password");
            }
            if (i == 3) {
                System.out.println("Please try again in 5 minutes");
            }
        }

        sc.close();
    }
}
