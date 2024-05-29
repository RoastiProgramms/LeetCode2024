package com.company;

public class May29 {
    public int numSteps(String s) {
        int count=0;
        int result=1;
        if(s.length()<2)
        {
            return 0;
        }
        if(s.length()<3)
        {
            return 1;
        }
        while(s.charAt(s.length()-1-count)=='0')
        {
            count++;
            result++;
        }
        for(int i=count;i<s.length();i++)
        {
            if(s.charAt(s.length()-1-i)=='0')
            {
                result+=2;
            }
            else
            {
                result+=1;
            }
        }
        return result;
    }
}
