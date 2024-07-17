package com.company;

public class June17 {
    public boolean judgeSquareSum(int c) {
        int left=0;
        long right=(long) Math.sqrt(c);
        while(left<=right)
        {
            if(left*left+right*right==c)
            {
                return true;
            }
            else if(left*left+right*right>c)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return false;
    }
}
