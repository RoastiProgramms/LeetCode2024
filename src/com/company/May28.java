package com.company;

public class May28 {
    public int equalSubstring(String s, String t, int maxCost) {
        int curCost=0;
        int maxCount=0;
        int start=0;
        for(int end=0;end<s.length();end++)
        {
            curCost+=Math.abs(s.charAt(end)-t.charAt(end));
            while(curCost>maxCost)
            {
                curCost-=Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            maxCount=Math.max(maxCount, end-start+1);
        }
        return maxCount;
    }
}
