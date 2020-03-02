package Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] result = transform(arr);
        printArray(result);
    }
    public static int[] transform(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
