package p1116;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest2 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);

        int inputData = 0;
        System.out.print("Input Data : ");
        //  문자 10개를 저장 할수 있는 배열을 만든다. 자바의 char 타입은 2byte 다.
        char[] temp = new char[10];

        try {
            //  InputStreamReader 의 read(char 배열) 메소드가 char 배열을 인수로 가졌을 경우,
            //  배열의 크기만큼 문자를 읽어들인 후 읽어드린 문자의 수를 반환한다.
            inputData = isr.read(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (char c : temp) {
            System.out.print(c + " ");
        }
    }
}
