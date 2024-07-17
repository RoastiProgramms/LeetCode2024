package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class June18 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        HashMap<Integer,Integer> pdLink=new HashMap<>();
        for(int i=0;i<profit.length;i++)
        {
            if(pdLink.containsKey(profit[i]))
            {
                pdLink.put(profit[i],Math.min(difficulty[i],pdLink.get(profit[i])));
            }
            else
            {
                pdLink.put(profit[i],difficulty[i]);
            }
        }
        Arrays.sort(profit);
        Arrays.sort(worker);
        reverse(profit);
        reverse(worker);
        int res=0;
        int temp1=0;
        int curJob=0;
        while(temp1<worker.length&&curJob<profit.length)
        {
            if(worker[temp1]>=pdLink.get(profit[curJob]))
            {
                while(worker[temp1]>=pdLink.get(profit[curJob]))
                {
                    res+=profit[curJob];
                    temp1++;
                    if(temp1>=worker.length)
                    {
                        return res;
                    }
                }
            }
            curJob++;
        }
        return res;
    }
    public void reverse(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
