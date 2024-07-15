package com.company;

public class July10 {
    public int minOperations(String[] logs) {
        int res=0;
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].equals("../"))
            {
                if(res>0)
                {
                    res-=1;
                }
            }
            if(logs[i].charAt(0)>='a'&&logs[i].charAt(0)<='z'||logs[i].charAt(0)>='1'&&logs[i].charAt(0)<='9')
            {
                res+=1;
            }
        }
        return res;
    }
}
