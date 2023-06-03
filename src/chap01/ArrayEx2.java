package chap01;

public class ArrayEx2 {
    public static void inPut(int arr1[],int arr2[], int arr3[]){
        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1.length; j++){
                if(j%2 == 1){
                    arr1[j] = j+1;
                }
                if(j % 2 == 0){
                    arr2[j] = j+1;
                }
            }
            if (i % 2 == 1) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i];
            }
        }
    }
    public static void outPut(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int[] brr = new int[1000];
        int[] crr = new int[1000];

        inPut(arr, brr, crr);

        outPut(arr);
        System.out.println();
        outPut(brr);
        System.out.println();
        outPut(crr);
    }
}
