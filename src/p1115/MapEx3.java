package p1115;

import java.util.*;

public class MapEx3 {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<String, Integer>();

        scoreMap.put("홍길동", 97);
        scoreMap.put("임꺽정", 88);
        scoreMap.put("원균", 10);
        scoreMap.put("이완용", 1);
        scoreMap.put("마이클", 76);

        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println();
//            System.out.print("이름 : ");
//            String name = sc.next();
//            scoreMap.get(name);
//
//            if (name.equalsIgnoreCase("exit")) {
//                System.out.println("종료합니다");
//                break;
//            } else {
//                System.out.println(scoreMap.get(name));
//            }
//        }

        Set<String> keys = scoreMap.keySet();

        Iterator<String> it = keys.iterator();
        //  Set 에 있는 모든 키를 순서대로 검색할 수 있는 기능을 제공하는 객체
        while (it.hasNext()) {
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name + " : " + score);
        }

        System.out.println();

        for(String key : keys){
            System.out.println(key + " : " + scoreMap.get(key));
        }

        sc.close();
    }
}
