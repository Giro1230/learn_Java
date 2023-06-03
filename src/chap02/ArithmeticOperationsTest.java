package chap02;

import java.util.Scanner;

public class ArithmeticOperationsTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArithmeticOperations ac = new ArithmeticOperations();
        int swNum = 1;
        
        while(swNum > 0){

            System.out.println("1. Plus\t2. Minus\t3. Multiplication\n4. Division\t5. Circle\t6. Pythagorean Theorem\n0. Close");
            System.out.print("Choice Number >> ");
            int choiceNumber = sc.nextInt();

            switch (choiceNumber) {
                case 1:
                    System.out.print("First Input Number >>");
                    int pNum1 = sc.nextInt();
                    System.out.print("Second Input Number >> ");
                    int pNum2 = sc.nextInt();

                    ac.setNum1(pNum1);
                    ac.setNum2(pNum2);
                    ac.plus();
                    System.out.println();
                    break;

                case 2:
                    System.out.print("First Input Number >>");
                    int minusNum1 = sc.nextInt();
                    System.out.print("Second Input Number >> ");
                    int minusNum2 = sc.nextInt();

                    ac.setNum1(minusNum1);
                    ac.setNum2(minusNum2);
                    ac.minus();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("First Input Number >>");
                    int muNum1 = sc.nextInt();
                    System.out.print("Second Input Number >> ");
                    int muNum2 = sc.nextInt();

                    ac.setNum1(muNum1);
                    ac.setNum2(muNum2);
                    ac.multiplication();
                    System.out.println();
                    break;

                case 4:
                    System.out.print("First Input Number >>");
                    int diNum1 = sc.nextInt();
                    System.out.print("Second Input Number >> ");
                    int diNum2 = sc.nextInt();

                    ac.setNum1(diNum1);
                    ac.setNum2(diNum2);
                    ac.division();
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Input Number >> ");
                    int circleNum = sc.nextInt();

                    ac.setNum1(circleNum);
                    ac.circle();
                    System.out.println();
                    break;

                case 6:
                    System.out.print("First Input Number >>");
                    int piNum1 = sc.nextInt();
                    System.out.print("Second Input Number >> ");
                    int piNum2 = sc.nextInt();

                    ac.setNum1(piNum1);
                    ac.setNum2(piNum2);
                    ac.pythagoreanTheorem();
                    System.out.println();
                    break;

                case 0 :
                    swNum = 0;
                    break;
            }
        }
        
        sc.close();
    }
}
