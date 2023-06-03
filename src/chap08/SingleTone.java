package chap08;

public class SingleTone {
    private static SingleTone instance = new SingleTone();

    private SingleTone(){
    }

    static SingleTone getInstance(){
        return instance;
    }
}

class SingleToneTest{
    public static void main(String[] args) {
        SingleTone singleTone = SingleTone.getInstance();
    }
}
