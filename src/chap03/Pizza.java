package chap03;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {
    private int radius;

    Pizza(int radius){
        this.radius = radius;
    }

    Pizza whosLargest(Pizza p1, Pizza p2){
        if (p1.getRadius() > p2.getRadius()) {
            System.out.println("1번이 더 크다");
            return p1;
        } else {
            System.out.println("2번이 더 크다");
            return p2;
        }
    }

    public int getRadius() {
        return radius;
    }
}

class PizzaTest{
    public static void main(String[] args) {
        ArrayList<Pizza> piz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("1번 피자의 반지름 : ");
        int radius = sc.nextInt();
        
        Pizza pz1 = new Pizza(radius);
        piz.add(pz1);
        
        System.out.print("2번 피자의 반지름 : ");
        radius = sc.nextInt();
        
        Pizza pz2 = new Pizza(radius);
        piz.add(pz2);

        Pizza p = pz1.whosLargest(pz1, pz2);

        System.out.println(p.getRadius() * p.getRadius() * 3.141592);
    }
}
