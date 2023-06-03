package p1116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {
        String inputData = "";

        FileReader fr = new FileReader("sample_kor2.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // int count = 1;

        String line = br.readLine();
        while (line != null){
            StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()){
                if(st.nextToken().equals("java")){
                    bw.write(line);
                    bw.flush();
                    bw.newLine();
                    break;
                }
            }
            line = br.readLine();
        }
        br.close();
    }
}
