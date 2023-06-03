package p1115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[26];
        System.out.println("input");
        StringBuffer sb = new StringBuffer();
        String str = "";

        while (!str.equals(";")){
            str = br.readLine().toLowerCase();
            sb.append(str);
        }

        for (int i = 0; i < sb.indexOf(";"); i++) {
            char c = sb.charAt(i);
            if(c >= 'a' && c <= 'z'){
                int idx = c - 'a';
                a[idx]++;
            }
        }

        int count = 0;

        for(int i : a){
            System.out.print((char)('A'+count) + "("+ i + ") ");
            count++;
        }
    }
}
