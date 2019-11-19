package com.fly.learn.algorithm.dp;

/**
 * @Description 动态规划
 *  给定一个整数数组 nums,
 *  找到一个具有最大和的连续子数组（子数组最少包含一个元素），
 *  返回其最大和。
 *  示例：   输入: [-2,1,-3,4,-1,2,1,-5,4],
 *          输出: 6
 *          解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 *  分析: 将前 i 个元素的具有最大和的连续子数组的值记为 dp[i], 则
 *       dp[i] = nums[i] ;  // i = 0
 *       dp[i] = dp[i - 1] + max(num[i], 0); // i > 0
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/11/15 16:34
 */
public class MaxSubListSum {


    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSubSum = maxSubArrSum(arr);
        System.out.println(maxSubSum);
    }

    public static int maxSubArrSum(int[] arr) {

        int[] dp = new int[arr.length];

        dp[0] = arr[0];
        int maxSum = dp[0];

        for(int i=1, len=arr.length; i<len; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            if(dp[i] > maxSum) {
                maxSum = dp[i];
            }
        }

        return maxSum;

    }






}
