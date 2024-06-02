package com.company;

public class May20 {
    public int subsetXORSum(int[] nums) {
        return subsetXOR(nums,0,0);
    }
    public int subsetXOR(int[] nums,int index, int curSum)
    {
        if(index>=nums.length)
        {
            return curSum;
        }
        int include=subsetXOR(nums,index+1,curSum^nums[index]);
        int exclude=subsetXOR(nums,index+1,curSum);
        return include+exclude;
    }
}
