package p1115;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")) {
            System.out.println("햄도 포함되어 있다");
        }

        System.out.println();

        Set<String> s = new HashSet<>();
        String[] sample = {"사과", "사과", "바나나", "토마토"};
        for(String a : sample){
            if(!s.add(a)){
                System.out.println("중복된 단어 : " + a);
            }
        }

        System.out.println(s.size() + "중복되지 않은 단어 : " + s);
    }
}
