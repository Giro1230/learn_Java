package chap01;

import java.util.Scanner;

public class A_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Input age >> ");
            int age = sc.nextInt();

            // System.out.println(age);
            System.out.print("Input name >> ");
            String name = sc.nextLine();

            System.out.println("You name is "+name);
            
            if(age >= 20){
                System.out.println("Welcome");
            }else{
                System.out.println("Ops~ Get out");
            }

            System.out.println("Hello, Java");
            // System.out.println("Hello, Java");
            int[] str = new int[5];
            int[] str2 = {0,1,2,3,4};
            System.out.println(str);
            System.out.println(str2);
        }
        sc.close();
    }
}