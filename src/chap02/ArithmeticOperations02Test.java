package chap02;

import java.util.Scanner;

public class ArithmeticOperations02Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArithmeticOperations02 c = new ArithmeticOperations02();
        System.out.print("Input Number >> ");
        int radius = sc.nextInt();
        
        c.setArea(radius);
        c.getArea();
        
        System.out.printf("\nAnswer : %.4f\n",c.getArea());
        
        ArithmeticOperations02 c2 = new ArithmeticOperations02();
        System.out.print("Input Width Number >> ");
        int width = sc.nextInt();
        
        System.out.print("Input Height Number >> ");
        int height = sc.nextInt();
        
        c2.setRectangle(width, height);
        System.out.printf("\nAnswer : %d\n",c2.getRectangle());

        
        sc.close();
    }
}
