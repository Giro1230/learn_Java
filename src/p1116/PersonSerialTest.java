package p1116;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonSerialTest {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("PersonInfo.sel");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        Person p1 = new Person("김민지", "부산", 26);
        Person p2 = new Person("양다현", "창원", 23);
        Person p3 = new Person("강민기", "대구", 25);

        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);

        out.close();

        System.out.println("객체 직렬화 완료");
    }
}
