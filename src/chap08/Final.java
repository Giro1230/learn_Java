package chap08;

class A {
    final int n;

    A(int n){
        this.n = n;
    }
}

class Test{
    public static void main(String[] args) {
        A a = new A(10);
//        a.n = 13;
        A b = new A(11);
        A c = new A(12);

        System.out.println(a.n);
        System.out.println(b.n);
        System.out.println(c.n);
    }
}