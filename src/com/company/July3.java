package com.company;

public class July3 {
    public int minDifference(int[] nums) {
        if(nums.length<5)
        {
            return 0;
        }
        int one=Integer.MAX_VALUE;
        int two=Integer.MAX_VALUE;
        int three=Integer.MAX_VALUE;
        int four=Integer.MIN_VALUE;
        int five=Integer.MIN_VALUE;
        int six=Integer.MIN_VALUE;
        int tempMin=Integer.MIN_VALUE;
        int tempMax=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<one)
            {
                tempMin=three;
                three=two;
                two=one;
                one=nums[i];
            }
            else if(nums[i]<two)
            {
                tempMin=three;
                three=two;
                two=nums[i];
            }
            else if(nums[i]<three)
            {
                tempMin=three;
                three=nums[i];
            }
            else if(nums[i]<tempMin)
            {
                tempMin=nums[i];
            }
            if(nums[i]>six)
            {
                tempMax=four;
                four=five;
                five=six;
                six=nums[i];
            }
            else if(nums[i]>five)
            {
                tempMax=four;
                four=five;
                five=nums[i];
            }
            else if(nums[i]>four)
            {
                tempMax=four;
                four=nums[i];
            }
            else if(nums[i]>tempMax)
            {
                tempMax=nums[i];
            }
        }
        return Math.min(Math.min(Math.abs(one-tempMax),Math.abs(two-four)),Math.min(Math.abs(three-five),Math.abs(tempMin-six)));
    }
}
