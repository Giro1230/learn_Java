package chap01;

import java.util.Random;
import java.util.Scanner;

public class Game01 {
    public static int getNumber() {
        Random rn = new Random();
        int rNum = rn.nextInt(45)+1;
    
        return rNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choiceNum = 0;
        int rNum = getNumber();
        
        while(choiceNum != rNum){
            System.out.print("Input Number >> ");
            choiceNum= sc.nextInt();

            if(choiceNum == rNum){
                System.out.println("You Win!");
            }else{
                System.out.println("One More?");
            }
        }

        sc.close();
    }
}
