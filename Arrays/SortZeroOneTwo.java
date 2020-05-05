/* 
Sort an array of 0s, 1s and 2s
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.

@author-https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0

*/

import java.util.Scanner;



class SortZeroOneTwo{
    public static void main(String [] args) {
        Scanner sc =new Scanner (System.in);
        int tc =sc.nextInt();
        for(int k=0;k<tc;k++){
            int n =sc.nextInt();
            int arr[] =new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            sort(arr,n);

        }
        sc.close();
    
    }

    private static void sort(int[] arr, int n) {
        int p, c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            switch(arr[i]){
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }
        p=0;
        while (c0>0){
            arr[p++]=0;
            c0--;
        }
        while (c1 >0){
            arr[p++]=1;
            c1--;
        }
        while(c2 >0){
            arr[p++]=2;
            c2--;
        }
        printArray(arr,n);
    }

    private static void printArray(int[] arr, int n) {
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
