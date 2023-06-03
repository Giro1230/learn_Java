package chap02;

import java.util.Random;
import java.util.Scanner;

public class BingGoMethod {

    // 숫자 입력받기
    public static int inputNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number >> ");
        int num = sc.nextInt();

        return num;
    }

    // 최대수 뽑기
    public static int range(int inputNum){
        int range = inputNum * inputNum;
        return range;
    }

    // 1차원 배열 공간 할당
    public static int[] randomNumberArray(int range) {
        int[] randomNumberTable = new int[range];
        
        return randomNumberTable;
    }

    // 1차원 배열공간에 중복수 없기 숫자 넣기
    public static int[] randomNumberMake(int range, int[] randomNumberArr){
        Random rd = new Random();
        for (int i = 0; i < range; i++) {
            int randomNumber = rd.nextInt(range)+1;
            randomNumberArr[i] = randomNumber;
            
            for (int j = 0; j < i; j++) {
                if(randomNumberArr[i] == randomNumberArr[j]){
                    i--;
                    break;
                }
            }
        }

        return randomNumberArr;
    }

    // 2차원 배열 공간 할당
    public static int[][] bingGoTableArray(int num) {
        int[][] bingGoTable = new int[num][num];
        
        return bingGoTable;
    }

    // 2차원배열로 된 빙고 테이블에 값을 할당
    public static int[][] bingGoTableMake(int inputNum,int[][] bingGoTable, int[] randomNumberArr) {
        int k = 0;
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum; j++) {
                bingGoTable[i][j] = randomNumberArr[k];
                k++;
            }
        }
        return bingGoTable;
    }

    // 빙고태이블 출력
    public static void bingGoTableOutput(int num, int[][] bingGoTable) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(j == (num * j)){
                    System.out.println();
                }
                System.out.print(bingGoTable[i][j] + "\t");
            }
        }
    }

    // 빙고 숫자 선택하기
    public static int bingGoInputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("BingGo Number Input >> ");
        int choiceNumber = sc.nextInt();

        return choiceNumber;
    }

    // 빙고 숫자 선택을 카운트
    public static int choiceNumberCount(int choiceNumberCount) {
        choiceNumberCount++;
        return choiceNumberCount;
    }

    // 선택한 숫자를 0으로 바꿔주기
    public static int[][] choiceNumberChange(int num, int choiceNumber ,int[][] bingGoTable) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(bingGoTable[i][j] == choiceNumber){
                    bingGoTable[i][j] = 0;
                }
            }
        }

        return bingGoTable;
    }

    // 빙고 조건
    public static int bingGoCount(int num, int choiceNumberCount, int[][] choiceNumberChange, int bingGoCount) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                // 빙고 왼쪽에서 오른쪽 조건
                if(i == j && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                    bingGoCount++;
                }
                // i = 0 또는 j = 0
                if(i + j == i && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                    bingGoCount++;
                }
                
                if((i+i) + j == j && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                    bingGoCount++;
                }
                if(i + (j+j) == j && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                    bingGoCount++;
                }
            }
        }

        return bingGoCount;
    }

    // choiceNumberCount 초기화
    public static int choiceNumberCount2(int num, int choiceNumberCount, int[][] choiceNumberChange, int bingGoCount) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                // 빙고 왼쪽에서 오른쪽 조건
                if(i == j && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                }
                // i = 0 또는 j = 0
                if(i + j == i && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                }
                
                if((i+i) + j == j && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                }
                if(i + (j+j) == j && choiceNumberChange[i][j] == 0 && choiceNumberCount >= num){
                    choiceNumberCount = bingGoCount;
                }
            }
        }

        return choiceNumberCount;
    }

    public static void main(String[] args) {
        int num = inputNum();
        int range = range(num);

        int[] rdArr = randomNumberArray(range);
        int[] rdnTable = randomNumberMake(range, rdArr);

        int[][] bgArr = bingGoTableArray(num);
        int[][] bgTable = bingGoTableMake(num, bgArr, rdnTable);

        bingGoTableOutput(num, bgTable);

        
        // 빙고게임 시작
        int bingGoCnt = 0;
        int zeroCnt = 0;
        
        while (bingGoCnt < 3) {
            int bgcNum = bingGoInputNumber();
            zeroCnt = choiceNumberCount(zeroCnt);
            
            int[][] TableChange = choiceNumberChange(num, bgcNum, bgTable);
            bingGoCnt = bingGoCount(num, zeroCnt, TableChange, bingGoCnt);
            zeroCnt = choiceNumberCount2(num, zeroCnt, TableChange, bingGoCnt);
            
            bingGoTableOutput(num, TableChange);
            System.out.println("\nChoice Count : "+zeroCnt);
            System.out.println("BingGo Count : "+bingGoCnt);
        }
    }
}
