package p1118.Ex7;

public class Camp7<T1, T2> {
    private T1 param1;
    private T2 param2;

    public void set(T1 param1, T2 param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public String toString() {
        return  param1 + " & " + param2;
    }
}
