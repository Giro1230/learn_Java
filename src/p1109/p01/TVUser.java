package p1109.p01;

public class TVUser {
    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory();
        ITV tv;
        tv = (ITV) factory.getBean("SAMSUNG");
        tv.on();
        tv.down();
        tv.up();
        tv.off();

        System.out.println();

        tv = (ITV) factory.getBean("LG");
        tv.on();
        tv.down();
        tv.up();
        tv.off();
    }
}
