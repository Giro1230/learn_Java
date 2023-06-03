package p1115;

public class MathEx {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.ceil(Math.PI)); // 올림
        System.out.println(Math.floor(Math.PI)); // 내림
        System.out.println(Math.sqrt(9)); // 루트(제곱근)
        System.out.println(Math.sqrt(4)); // 루트(제곱근)
        System.out.println(Math.exp(4)); // e(오일러상수, 자연 로그의 밑)의 4승
        System.out.println(Math.round(3.64)); // 반올림

        System.out.println("이번 주 행운의 번호는");
        for (int i = 0; i < 5; i++) {
            System.out.print((int)(Math.random() * 45+1) + "\t");
        }
    }
}
