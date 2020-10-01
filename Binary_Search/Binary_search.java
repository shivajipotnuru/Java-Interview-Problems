/*Iterative binary search algorithm is a searching method by dividing a sorted array in half
 * if the searching value is less than the element in the middle of the array,  algo searches the lower part of the array
 * otherwise search the upper part of the array. this will be repeated until the value is found*/


public class Binary_search {
    public int search(int arr[], int x){
//      l is the index of left most value of array, r is the index of right most value of array
        int l = 0, r = arr.length - 1;

//      iterates while l is less than or equal to r
        while(l <= r){
//            m is the index of middle value of the array
            int m = l + (r  - l) / 2;

            /*           if middle value of the array is equal to the searching value method returns m,
             *           if searching value is less than m it assigns left most value as next value to middle
             *           otherwise one before middle value will be assigned as right most value*/
            if (arr[m] == x){
                return m;
            }
            else if (arr[m] < x){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
//       if searching value is not found after iteration -1 will be returned
        return -1;
    }

    public static void main(String[] args) {
        Binary_search bs = new Binary_search();

        int arr[] = {1, 5, 8, 10, 36, 48};

        int result = bs.search(arr, 36);

        if (result == -1){
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index : " + result);
        }
    }
}
