package testinterface.p1108;

public class Main {
    public static void testMethod(Interface01 i){

    }

    public static void main(String[] args) {

        Interface01 x = new A();
        A y = (A) x;


        A a = new A();
        a.afunc();
        a.ifunc();

        B b = new B();
        b.bfunc();
        b.ifunc();

        C c = new C();
        c.cfunc();
        c.ifunc();

        x.ifunc();

    }
}
