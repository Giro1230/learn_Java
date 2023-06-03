package p1116;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    //  Reader 가 붙은 클래스는 2Byte 단위로 읽어 들인다.
    public static void main(String[] args) {
        //InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(System.in);

        int inputData = 0;
        System.out.print("Input Data : ");

        try {
            //  InputStreamReader 가 제공하는 read() 메소드는 2byte 를 읽어 정수 코드값을 반환한다.
            inputData = isr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("실제 입력된 데이터 : " + (char) inputData);

    }
}
