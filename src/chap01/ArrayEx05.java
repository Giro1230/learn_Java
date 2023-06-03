package chap01;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx05 {
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number >>");
        int num = sc.nextInt();
        
        sc.close();
        return num;
    }
    public static void rNum(int n) {
        Random rd = new Random();
        int[] lotto = new int[n];
        
        for(int i = 0; i < lotto.length; i++){
            int rNum = rd.nextInt(45)+1;
            lotto[i] = rNum;
            for (int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
        for (int j = 0; j < lotto.length; j++) {
            System.out.print(lotto[j] + " ");
        }
    }
    
    public static void main(String[] args) {
        int num = input();
        rNum(num);
    }
}
