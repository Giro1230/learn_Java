package chap01;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx06 {

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput Number >> ");
        int num = sc.nextInt();
        
        return num;
    }

    public static int[][] rNum() {
        int n = input();
        Random rd = new Random();
        int nnum = n*n;
        int x = 0;
        int[][] rn = new int[n][n];
        int[] rnum = new int[nnum];

        for(int i = 0; i < rnum.length; i++){
            int rNum = rd.nextInt(25)+1;
            rnum[i] = rNum;
            for (int j = 0; j < i; j++) {
                if (rnum[i] == rnum[j]) {
                    i--;
                    break;
                }
            }
        }
        
        for(int i = 0; i < rn.length; i++){
            for (int j = 0; j < rn.length; j++) {
                rn[i][j] = rnum[x];
                x++;
            }
        }

        for (int i = 0; i < rn.length; i++) {
            for (int j = 0; j < rn.length; j++) {
                if(j == (5 * j)){
                    System.out.println();
                }
                System.out.print(rn[i][j] + "\t");
            }
        }

        return rn;
    }

    public static void bingGo() {
        int[][] sheet = rNum();
        int bingGoNum = 0;
        int cnt = 0;

        while (bingGoNum < 3) {
            int inputNum = input();

            for (int i = 0; i < sheet.length; i++) {
                for (int j = 0; j < sheet.length; j++) {
                    if(sheet[i][j] == inputNum){
                        sheet[i][j] = 0;
                        cnt++;

                        if(sheet[j][i] == 0 && cnt <= 5 ){
                            for (int x = 0; x < sheet.length; x++) {
                                if(sheet[x][j] != 0){
                                    break;
                                }
                            }
                        }
                        if(sheet[i][j] == 0 && cnt <= 5){
                        }
                        if(i == j && sheet[i][j] == 0 && cnt <= 5){
                        }

                    }
                    
                }
            }


            for (int i = 0; i < sheet.length; i++) {
                for (int j = 0; j < sheet.length; j++) {
                    if(j == (5 * j)){
                        System.out.println();
                    }
                    System.out.print(sheet[i][j] + "\t");
                }
            }
        }
        




    }
    
    public static void main(String[] args) {
        bingGo();
    }
}
