package chap02;

public class MyListTest {
    public static void main(String[] args) {
        MyList3 list = new MyList3();

        list.add("홍길동");
        list.add("임꺽정");
        list.add("이몽룡");
        list.add("성춘향");
        list.add("홍재우");

        list.add("홍길동");
        list.add("임꺽정");
        list.add("이몽룡");
        list.add("성춘향");
        list.add("홍재우");

        list.add("홍길동");
        list.add("임꺽정");
        list.add("이몽룡");
        list.add("성춘향");
        list.add("홍재우");

        list.add("홍길동");
        list.add("임꺽정");
        list.add("이몽룡");
        list.add("성춘향");
        list.add("홍재우");

        list.add("홍길동");
        list.add("임꺽정");

        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i+1));
            System.out.println(i+1);
        }

    }
}
