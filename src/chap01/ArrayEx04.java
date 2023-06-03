package chap01;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx04 {

    public static int inputNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number >> ");
        int num = sc.nextInt();

        sc.close();
        return num;
    }
    public static void diceCount(int num) {
        Random rd = new Random();
        int[] count = new int[6];
        
        for (int i = 0; i < num; i++) {
            int dice = rd.nextInt(6)+1;
            count[dice-1]++;
        }

        int s = 1;
        for (int i : count) {
            System.out.printf("%d Dice count : %d\n", s++,i);
        }
    }
    public static void main(String[] args) {
        int num = inputNum();
        diceCount(num);
    }
}
