package chap02;

import java.util.Scanner;

public class BomberTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Map Number >> ");
        int num = sc.nextInt();
        System.out.print("Input Bombs Number >> ");
        int bombs = sc.nextInt();
        
        char[][] map = new char[num][num];
        
        Bomber02 b = new Bomber02(map);
        
        b.makeMap(num);
        b.bombersLoad(bombs);
        b.makeTarget(num);
        b.mapOutput();
        
        int bomberCnt = 1;
        
        while(bomberCnt > 0){
            System.out.print("Input X Number >> ");
            int X = sc.nextInt();

            System.out.print("Input Y Number >> ");
            int Y = sc.nextInt();

            bomberCnt = b.dropBomb(num , X, Y);
            b.mapOutput();
        }

        sc.close();
    }
}
