package p1115;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[26];
        System.out.print("input : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if(str.equalsIgnoreCase(";")){
                System.out.println("Program is Close");
                break;
            }

            char c = str.toLowerCase().charAt(i);
            if(c >= 'a' && c <= 'z'){
                int idx = c - 'a';
                a[idx]++;
            }
        }

        char c;
        int j = 65;
        for(int i = 0; i < a.length; i++){
            System.out.print((c = (char)(j + i)) + "("+ a[i] + ") ");
        }
    }
}
