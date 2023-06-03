package chap01;

import java.util.Random;
import java.util.Scanner;

public class Game02 {
    public static int input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Rock   2. Scissors   3. Paper");
        System.out.print("Input Number >>");
        int num = sc.nextInt();

        sc.close();
        return num;
    }

    public static void compare(int n){
        Random rd = new Random();
        int rn = rd.nextInt(3)+1;

        if(n == rn){
            System.out.println("Draw");
        }else{
            switch(n){
                case 1:
                // rock
                if(rn == 2){
                    System.out.println("Winner!");
                }else{
                    System.out.println("Loser!");
                }
                break;
                case 2:
                // scissors
                if (rn == 3) {
                    System.out.println("Winner!");
                } else {
                    System.out.println("Loser!");
                }
                break;
            case 3:
                // paper
                if (rn == 1) {
                    System.out.println("Winner!");
                } else {
                    System.out.println("Loser!");
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        int num = input();
        compare(num);
    }
}
