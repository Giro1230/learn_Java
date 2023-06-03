package p1116;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        int inputData = 0;

        try {
            fr = new FileReader("sample_kor.txt");
            //  파일에서 2바이트씩 데이터를 읽어 정수 코드값을 반환한다.
            //  정수 값을 문자형을 형변환(캐스팅)하여 출력한다.
            //  데이터를 모두 읽으면(파일에 끝에 도달하면) -1을 반환한다.
            while ((inputData = fr.read()) != -1){
                System.out.print((char) inputData);
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
