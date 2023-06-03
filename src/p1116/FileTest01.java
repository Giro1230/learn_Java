package p1116;

import java.io.File;

public class FileTest01 {
    public static void main(String[] args) {
        String fileMame = "";
        File file = new File(fileMame);

        if(!file.exists() || !file.isDirectory()) {
            System.out.println(fileMame + "없는 디렉토리입니다.");
            System.exit(0); // 시스템 강제 종료
        }

        File[] files = file.listFiles();
        System.out.println("파일 / 디렉토리 수 : " + files.length);
        for (int i = 0; i < files.length; i++) {
            //System.out.println("File Name : " + files[i].getName());
            //System.out.println("File 경로 : " + files[i].getPath());
            //System.out.println("File 절대 경로 : " + files[i].getAbsolutePath());
            //System.out.println("디렉토리 : " + files[i].getParent());
            //System.out.println("읽기 가능 : " + files[i].canRead());
            //System.out.println("쓰기 가능 : " + files[i].canWrite());
            //System.out.println("파일 크기 : " + files[i].length());
        }
    }
}
