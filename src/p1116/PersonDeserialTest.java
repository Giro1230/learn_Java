package p1116;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class PersonDeserialTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("PersonInfo.sel");
        ObjectInputStream in = new ObjectInputStream(fis);

        Person p1 = (Person) in.readObject();
        Person p2 = (Person) in.readObject();
        Person p3 = (Person) in.readObject();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("객체 역직렬화 완료");
    }
}
