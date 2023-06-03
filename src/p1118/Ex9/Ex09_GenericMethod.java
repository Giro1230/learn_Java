package p1118.Ex9;

class MyData{
    //  타입 추론
    public static <T> T showData(T data){
        if (data instanceof String)
            System.out.println("String");
        else if (data instanceof Integer)
            System.out.println("Integer");
        else if (data instanceof Double)
            System.out.println("Double");

        return data;
    }
}

public class Ex09_GenericMethod {
    public static void main(String[] args) {
        String s = MyData.<String>showData("곤피");
        System.out.println(s);

        int i = MyData.<Integer>showData(11);
        System.out.println(i);

        double d = MyData.<Double>showData(Math.PI);
        System.out.println(d);
    }
}
