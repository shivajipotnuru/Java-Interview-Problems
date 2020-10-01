/*
Given an array nums,
Write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MoveZeroes{
    public static void main(String [] args) {
        Scanner scn =new Scanner (System.in);
        int numberOfTerms = scn.nextInt();
        int[] nums = new int[numberOfTerms];
        for(int i = 0; i<numberOfTerms; i++){
            nums[i] = scn.nextInt();
        }
        moveZeroes(nums);
        scn.close();

    }

    private static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;
        for(int i = 0;i<nums.length-1;i++) {
            if(nums[left] == 0 && nums[right] == 0) {
                right+=1;
                continue;
            }else {
                if(nums[left] == 0) {
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                }
                left+=1;
                right+=1;
            }
        }

        printArray(nums, nums.length);

    }

    private static void printArray(int[] arr, int n) {
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
