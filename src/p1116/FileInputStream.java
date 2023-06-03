package p1116;

import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) {
        int inputData = 0;

        java.io.FileInputStream fis;

        try {
            fis = new java.io.FileInputStream("sample.txt");
            //  파일에서 1바이트씩 데이터를 읽어 정수 코드값을 반환한다.
            //  정수 값을 문자형을 형변환(캐스팅)하여 출력한다.
            //  데이터를 모두 읽으면(파일에 끝에 도달하면) -1을 반환한다.

            while ((inputData = fis.read()) != -1) {
                System.out.print((char) inputData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
