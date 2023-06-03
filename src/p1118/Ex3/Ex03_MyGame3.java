package p1118.Ex3;

class Npc3{
    public String toString(){
        return "this is a Npc3";
    }
}

class Tank3{
    public String toString() {
        return "this is a Tank3";
    }
}

class Camp3{
    private Object unit;

    public Object get() {
        return unit;
    }

    public void set(Object unit) {
        this.unit = unit;
    }
}


public class Ex03_MyGame3 {
    public static void main(String[] args) {
        Camp3 hUnit = new Camp3();
        Camp3 mUnit = new Camp3();

        hUnit.set("홍길동");
        mUnit.set("사이보그");

        System.out.println(hUnit.get());
        System.out.println(mUnit.get());
    }
}
