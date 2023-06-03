package book02;

public class PrintBoolean {
    public static void main(String[] args) {
        boolean p;
        boolean q;
        boolean and;
        boolean or;
        boolean xor;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR");

        p = true;
        q = true;
        and = p && q;
        or = p || q;
        xor = p ^ q;
        System.out.printf("%b\t%b\t%b\t%b\t%b\t",p,q,and,or,xor);
        System.out.println();

        p = true;
        q = false;
        and = p && q;
        or = p || q;
        xor = p ^ q;

        System.out.printf("%b\t%b\t%b\t%b\t%b\t",p,q,and,or,xor);
        System.out.println();

        p = false;
        q = true;
        and = p && q;
        or = p || q;
        xor = p ^ q;
        System.out.printf("%b\t%b\t%b\t%b\t%b\t",p,q,and,or,xor);
        System.out.println();

        p = false;
        q = false;
        and = p && q;
        or = p || q;
        xor = p ^ q;
        System.out.printf("%b\t%b\t%b\t%b\t%b\t",p,q,and,or,xor);
        System.out.println();
    }
}
