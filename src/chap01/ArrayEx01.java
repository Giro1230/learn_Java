package chap01;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] brr = new int[3];

        for (int i = 0; i < brr.length; i++) {
            brr[i] = arr[i];
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
