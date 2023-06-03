package p1115;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);


        v.add(2, 100);

        System.out.println("백터 내의 요소 객체의 수 : " + v.size());
        System.out.println("백터의 현제 용량 : " + v.capacity());

        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n); // 백터의 i번쨰 정수
        }

        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.elementAt(i);
        }
        System.out.println(sum);
    }
}
