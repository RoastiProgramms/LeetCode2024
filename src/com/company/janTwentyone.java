package com.company;

public class janTwentyone {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(i<2)
            {
                dp[i]=Math.max(dp[i-1],nums[i]);
            }
            else
            {
                dp[i]=Math.max(dp[i-2]+nums[i],Math.max(dp[i-1],nums[i]));
            }
        }
        return dp[nums.length-1];
    }
}
