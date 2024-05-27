package com.company;

public class May27 {
    public int specialArray(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int num=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]>=i+1)
                {
                    num+=1;
                }
            }
            if(num==i+1)
            {
                return num;
            }
        }
        return -1;
    }
}
