package com.company;

import java.util.HashSet;

public class May31 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> numbers=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(numbers.contains(nums[i]))
            {
                numbers.remove(nums[i]);
            }
            else
            {
                numbers.add(nums[i]);
            }
        }
        Integer[] tempArray = numbers.toArray(new Integer[0]);

        int[] result = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            result[i] = tempArray[i];
        }

        return result;
    }
}
