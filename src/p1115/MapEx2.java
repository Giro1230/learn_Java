package p1115;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx2 {
    public static void main(String[] args) {
        //  Key : 영단어, Value : 한글
        Map<String, String> dic = new HashMap<String, String>();
        //var dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        //  사용자로 부터 영어 단어를 입력받고 한글단어를 검색한다.
        //  exit 를 입력받으면 종료한다.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("찾고 싶은 단어 : ");
            String eng = sc.next();
            dic.get(eng);

            if (eng.equalsIgnoreCase("exit")) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println(dic.get(eng));
            }
        }
        sc.close();
    }
}
