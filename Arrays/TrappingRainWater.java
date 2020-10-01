import java.util.Scanner;

public class TrappingRainWater {
  /*  Given n non-negative integers representing an elevation map where the width of each bar is 1,
    compute how much water it is able to trap after raining.
    https://leetcode.com/problems/trapping-rain-water/
    */
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N=sc.nextInt();
      int [] heights=new int[N];
      for(int i=0;i<N;i++){
          heights[i]=sc.nextInt();
      }
      System.out.println(trap(heights));
  }
    static int trap(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        int []leftMax=new int[heights.length];
        int []rightMax=new int[heights.length];
        leftMax[0]=heights[0];
        for(int i=1;i<heights.length;i++){
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }
        rightMax[heights.length-1]=heights[heights.length-1];
        for(int i=heights.length-2;i>=0;i--){
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }

        int trapWater=0;
        for(int i=1;i<heights.length-1;i++){
            int min = Math.min(leftMax[i - 1], rightMax[i + 1]);
            if(min >=heights[i])
                trapWater+= min -heights[i];

        }

        return trapWater;
    }


}
