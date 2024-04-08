// public class MaxSubarraySum{
//     public static int maxSubArraySum(int[] nums) {
//         int maxSum = nums[0];
//         int currentSum = nums[0];
        
//         for (int i = 1; i < nums.length; i++) {
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
            
           
//             maxSum = Math.max(maxSum, currentSum);
//         }
        
//         return maxSum;
//     }

//     public static void main(String[] args) {
//         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int result = maxSubArraySum(nums);
//         System.out.println("Output: " + result); // Output: 6
//     }
// }

class Solution {

public int maxSubArray(int []nums){

 int maxsum = nums[0];

 int sum =0;

 for(int i=0; i<nums.length; i++){

 sum=sum+nums[i];

 if(sum>maxsum)

 maxsum = sum;

 if(sum<0)

 sum=0;

 }

 return maxsum;

 

} 

};
