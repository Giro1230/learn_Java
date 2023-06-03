package p1116;

import java.io.*;

public class FileQ {
    public static void main(String[] args) throws Exception {
        String dir = "src";
        File d = new File(dir);
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("file name input : ");
        String name  = sc.readLine();

        String fileName = name + ".txt";
        File[] files = d.listFiles();

        for (File f : files) {
            if (f.exists() && !f.isDirectory()) {
                if(f.getName().equalsIgnoreCase(fileName)){
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);

                    FileWriter fw = new FileWriter("Copy"+fileName);
                    BufferedWriter bw = new BufferedWriter(fw);

                    String line = null;
                    while ((line = br.readLine())!= null) {
                        bw.write(line);
                    }

                    bw.close();
                    br.close();
                }
            }
        }
        sc.close();
    }
}