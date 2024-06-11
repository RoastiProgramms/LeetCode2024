package com.company;

import java.util.Arrays;

public class June10 {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);
        int res=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=sortedHeights[i])
            {
                res+=1;
            }
        }
        return res;
    }
}
