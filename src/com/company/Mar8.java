package com.company;

import java.util.HashMap;

public class Mar8 {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> numbers=new HashMap<>();
        int curMax=0;
        for(int i=0;i<nums.length;i++)
        {
            if(numbers.containsKey(nums[i]))
            {
                numbers.put(nums[i],numbers.get(nums[i])+1);
                if(curMax<numbers.get(nums[i]))
                {
                    curMax=numbers.get(nums[i]);
                }
            }
            else
            {
                numbers.put(nums[i],1);
            }
        }
        int count=0;
        for(int val: numbers.values())
        {
            if(val==curMax)
            {
                count++;
            }
        }
        if(curMax==0)
        {
            return nums.length;
        }
        return count*curMax;
    }
}
