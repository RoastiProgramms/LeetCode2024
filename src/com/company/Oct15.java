package com.company;

public class Oct15 {
    public long minimumSteps(String s) {
        int curBlack=0;
        long result=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                curBlack++;
            }
            else
            {
                result+=curBlack;
            }
        }
        return result;
    }
}
