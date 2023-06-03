package chap02;

import java.util.Scanner;

public class QuitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Quit q = new Quit();

        // System.out.print("문제를 선택하세요(1~5번) >> ");
        // int cN = sc.nextInt();
        // q.choiceQuit(cN);
        // q.quit();
        String answer = sc.next();
        // q.inputAnswer(answer);
        
        for (int i = 0; i < answer.length(); i++) {
            String[] x = answer.split(answer);
            System.out.println(x[i]);
        }
        String changeAnswer = answer.toLowerCase();
        System.out.println(changeAnswer);
        // q.quit2();
    }
}
