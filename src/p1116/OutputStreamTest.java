package p1116;

import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        OutputStream os = System.out;

        System.out.print("Input Data : ");

        int input = is.read();
        System.out.println("실제 입력된 데이터 : " + input);
        System.out.print("출력 데이터 : ");
        os.write((char) input);
        os.close();
    }
}
