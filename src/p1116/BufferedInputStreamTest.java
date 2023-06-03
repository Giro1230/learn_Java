package p1116;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws Exception {
        int inputData = 0;
        //  파일명을 인수로 하여 스트림(Input) 생성
        FileInputStream fis = new FileInputStream("sample.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        //  FileInputStream을 인수로 하여 보조 스트림 생성
        //  InputStream 의 보조임으로 BufferedInputStream 임.
        //  버퍼란? 메모리에 생성되는 임시 기억장소
        //  사용하는 이유? 데이터 처리속도 개선(빠르게)

        while ((inputData = bis.read()) != -1){
            System.out.print((char) inputData);
        }


    }
}
