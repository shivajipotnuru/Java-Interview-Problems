/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]


*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TwoSum{
    public static void main(String [] args) {
        Scanner scn =new Scanner (System.in);
        int numberOfTerms = scn.nextInt();
        int[] nums = new int[numberOfTerms];
        for(int i = 0; i<numberOfTerms; i++){
            nums[i] = scn.nextInt();
        }
        int target = scn.nextInt() ;
        twoSum(nums, target);
        scn.close();

    }

    private static void twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                int[] output = { map.get(complement), i };
                printArray(output, 2);
            }
            map.put(nums[i], i);
        }
    }

    private static void printArray(int[] arr, int n) {
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
