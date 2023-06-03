package p1116;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReadTest {
    public static void main(String[] args) throws Exception {
        String inputData = "";

        FileReader fr = new FileReader("sample_kor.txt");
        BufferedReader br = new BufferedReader(fr);
        //var sb = new StringBuffer();
        while ((inputData = br.readLine()) != null){
            System.out.println(inputData);
            //sb.append(inputData).append("\n");
        }
        //String str = sb.toString();
        //System.out.println(str);
        br.close();
        //fr.close();
    }
}
