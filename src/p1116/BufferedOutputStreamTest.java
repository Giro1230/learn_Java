package p1116;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws Exception {
        int inputData = 0;
        FileOutputStream fos = new FileOutputStream("alpha.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for (int i = 'a'-32; i < 'z'-32; i++) {
            bos.write(i);
        }

        bos.close();
    }
}
