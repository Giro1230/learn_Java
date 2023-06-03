package p1116;

//  ObjectInput/OutputStream
//  네트워크를 통해서 객체를 편하데 전달하기 위해 사용한다.
//  객체를 기록하기 위해서는 직렬화(Serialization)를 해야한다.
//  객체를 읽기 위해서는 역직렬화(Deserialization)를 해야한다.
//  직렬화할 객체는 클래스를 정의 할떄 Serializable 이라는 인터페이스를
//  구현한다고 표시해야한다.

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 7657846473477945653L;

    String name;
    String city;
    int age;

    public Person(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
