import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] arr = new int[n];
        int arrsize = arr.length;
        for(int i=0;i<arrsize;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=arrsize-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int value : arr) {
            System.out.print(value);
        }
    }
}
