package chap01;

public class Test01 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("num : " + n);

        int n = 10;
        int num = 10;
        int m = 3;
        double d = 2.3;
        double k = n + d;

        String s = "안녕하세요";
        char str = '가';
        
        System.out.println(n/(m *1.0));
        System.out.printf("%s %d %.2f %c\n",s,n,k,str);
        System.out.println("1"+num);

        String s2 = "Hello ";
        String s3 = "Java";
        System.out.println(s2+s3);
    }
}
