import java.util.Arrays;

public class Reorder {
    public static void main(String[] args) {
        new Reorder ().program ();
    }

    void program() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] orderarr = {0, 4, 1, 3, 2};

        reorder (arr, orderarr);
    }

    void reorder(int[] arr, int[] orderarr) {
        int[] copyarr = arr.clone ();

        for (int i = 0; i < arr.length; i++) {
            int pos = orderarr[i];
            arr[pos] = copyarr[i];
        }
        System.out.println (Arrays.toString (arr));
    }
}