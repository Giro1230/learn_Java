package chap02;

import java.util.Random;

public class BingGoClass {
    private int num;

    public void setInputNumber(int num) {
        this.num = num;
    }

    public int range() {
        int range = num * num;

        return range;
    }

    public int[] randomNumberTable(int range) {
        int[] randomNumberTable = new int[range];

        Random rd = new Random();
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

        return randomNumberTable;
    }

    public int[][] bingGoTable(int num, int randomNumberTable[]) {
        int[][] bingGoTable = new int[num][num];
        int k = 0;
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                bingGoTable[i][j] = randomNumberTable[k];
                k++;
            }
        }

        return bingGoTable;
    }
}
