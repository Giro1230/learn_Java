package book01;

public class Math {
    public static void main(String[] args) {
        int n = 1000;
        int n2 = 2000;
        System.out.println("덧셈 = " + (n + n2));
        System.out.println("뺄셈 = " + (n - n2));
        System.out.println("곱셈 = " + (n * n2));
        System.out.println("덧셈 = " + (double)(((n * 10) / n2)*0.1));
    }
}
