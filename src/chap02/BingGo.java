package chap02;

import java.util.Random;
import java.util.Scanner;

public class BingGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // 원하는 가로세로의 숫자를 입력 받기
        System.out.print("Input Number >> ");
        int numberInput = sc.nextInt();

        // 범위 지정
        int range = numberInput * numberInput;
        int[][] bingGoTableNumberIn = new int[numberInput][numberInput];
        int[] randomNumberTable = new int[range];
        
        // 중복수 없이 모든 수를 다 채우기
        for (int i = 0; i < range; i++) {
            int randomNumber = rd.nextInt(range)+1;
            randomNumberTable[i] = randomNumber;
            
            for (int j = 0; j < i; j++) {
                if(randomNumberTable[i] == randomNumberTable[j]){
                    i--;
                    break;
                }
            }
        }
        
        // 랜덤수를 빙고에 넣기
        int k = 0;
        for (int i = 0; i < numberInput; i++) {
            for (int j = 0; j < numberInput; j++) {
                bingGoTableNumberIn[i][j] = randomNumberTable[k];
                k++;
            }
        }
        // 빙고판 출력
        for (int i = 0; i < numberInput; i++) {
            for (int j = 0; j < numberInput; j++) {
                if(j == (numberInput * j)){
                    System.out.println();
                }
                System.out.print(bingGoTableNumberIn[i][j] + "\t");
            }
        }
        
        // 빙고게임 시작
        int bingGoCnt = 0;
        int zeroCnt = 0;

        while (bingGoCnt < 3) {
            // 숫자 선택하기
            System.out.println();
            System.out.print("BingGo Number Input >> ");
            int choiceNumber = sc.nextInt();

            for (int i = 0; i < numberInput; i++) {
                for (int j = 0; j < numberInput; j++) {
                    // 선택한 숫자를 0으로 바꿔주기
                    if(bingGoTableNumberIn[i][j] == choiceNumber){
                        bingGoTableNumberIn[i][j] = 0;
                        zeroCnt++;
                    }
                }
            }

            // 빙고 조건
            for (int i = 0; i < numberInput; i++) {
                for (int j = 0; j < numberInput; j++) {
                    // 빙고 왼쪽에서 오른쪽 조건
                    if(i == j && bingGoTableNumberIn[i][j] == 0 && zeroCnt >= numberInput){
                        bingGoCnt++;
                        zeroCnt = bingGoCnt;
                    }
                    // i = 0 또는 j = 0
                    if(i + j == i && bingGoTableNumberIn[i][j] == 0 && zeroCnt >= numberInput){
                        bingGoCnt++;
                        zeroCnt = bingGoCnt;
                    }
                    
                    if((i+i) + j == j && bingGoTableNumberIn[i][j] == 0 && zeroCnt >= numberInput){
                        bingGoCnt++;
                        zeroCnt = bingGoCnt;
                    }
                    if(i + (j+j) == j && bingGoTableNumberIn[i][j] == 0 && zeroCnt >= numberInput){
                        bingGoCnt++;
                        zeroCnt = bingGoCnt;
                    }
                }
            }
            



            // 빙고판 출력
            for (int i = 0; i < numberInput; i++) {
                for (int j = 0; j < numberInput; j++) {
                    if(j == (numberInput * j)){
                        System.out.println();
                    }
                    System.out.print(bingGoTableNumberIn[i][j] + "\t");
                }
            }
            System.out.println("BingGo Count : "+bingGoCnt);
        }

    }    
}
