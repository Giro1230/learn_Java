package p1115;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("사과");
        list.add("바나나");
        list.add("메론");
        list.add("복숭아");
        list.add("포도");

        ArrayList<String> list2 = new ArrayList<String>();
        list.add("ㅁㅁㅁㅁ");
        list2.add("사과");
        list2.add("바나나");
        list2.add("메론");
        list2.add("복숭아");
        list2.add("포도");

        list.addAll(list2);
        for (String e: list) {
            System.out.print(e + " ");
        }
        System.out.println();

        list2.clear();
        System.out.println("list2 출력");
        for (String s : list2) {
            System.out.print(s + " ");
        }

        System.out.println(list.contains("수박"));
        System.out.println(list.indexOf("바나나"));
        list.add(1, "수박");
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println(list.indexOf("바나나"));
        System.out.println(list.isEmpty());
        System.out.println(list2.isEmpty());

        // Object[] array = list.toArray();
        // String[] array2 = (String[]) list.toArray();

        list.remove(0);
        list.remove("수박");
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        list.remove("바나나");
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("------------------");
        Object[] array = list.toArray();
        String s = (String) array[0];
        System.out.println(s);
    }
}
