package p1116;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    //  InputStream 클래스를 시용하여 1개의 영문자(1Byte)를 읽어 들이는 프로그햄
    public static void main(String[] args) {
        //  키보드를 입력 스트림 객체에 할당한다.
        InputStream is = System.in;
        //  System.in, system.out, System.err 는 표준 입출력을 위해 자바가
        //  내부적으로 자동 생성해두는 객체이기 때문에 별도로 객체생성을 하지 않고 사용할 수 있다.

        int inputData = 0;
        System.out.print("Input Data : ");

        try {
            //  InputStream 이 제공하는 read() 메소드는 1Byte 를 읽어
            //  해당 문자의 정수코드값을 반환한다.
            inputData = is.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("실제 입력된 데이터(정수) : " + inputData);
        System.out.println("실제 입력된 데이터(문자) : " + (char)inputData);
    }
}
