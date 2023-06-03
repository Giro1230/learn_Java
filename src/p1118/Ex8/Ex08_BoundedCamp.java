package p1118.Ex8;

class Camp8<T extends Number>{
    private T o;

    public void set(T o) {
        this.o = o;
    }

    public T get() {
        return o;
    }
}

public class Ex08_BoundedCamp {
    public static void main(String[] args) {
        Camp8<Integer> iBox = new Camp8<Integer>();
        iBox.set(24);

        Camp8<Double> dBox = new Camp8<Double>();
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
