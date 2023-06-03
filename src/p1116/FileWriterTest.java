package p1116;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("sample_kor.txt");
        FileWriter fw = new FileWriter("sample_kor3.txt",true);

        int input = 0;
        while ((input = fr.read()) != -1){
            fw.write(input);
        }

        fr.close();
        fw.close();
    }
}
