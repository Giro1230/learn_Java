package p1116;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutStreamWriter {
    public static void main(String[] args) throws Exception {
        char[] ar = new char[10];

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        System.out.print("input data : ");

        int input = isr.read(ar);
        System.out.println("input : " + input);
        System.out.print("실제 입력된 값 : ");

        osw.write(ar);
        osw.close();
    }
}
