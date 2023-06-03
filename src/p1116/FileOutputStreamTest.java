package p1116;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("sample.txt");
        FileOutputStream fos = new FileOutputStream("sample2.txt");

        int input = 0;

        while ((input = fis.read()) != -1){
            fos.write(input);
            System.out.print((char)input);
        }

        fos.close();
        fis.close();
    }
}
