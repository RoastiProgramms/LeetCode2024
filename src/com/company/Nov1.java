package com.company;

public class Nov1 {
    public String makeFancyString(String s) {
        StringBuilder gosho=new StringBuilder();
        int curSec=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(curSec<2)
            {
                gosho.append(s.charAt(i));
            }
            if(s.charAt(i)==s.charAt(i+1))
            {
                curSec++;
            }
            else
            {
                curSec=0;
            }
        }
        if(curSec<2)
        {
            gosho.append(s.charAt(s.length()-1));
        }
        return gosho.toString();
    }
}
