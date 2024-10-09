package com.company;

public class Oct9 {
    public int minAddToMakeValid(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                start++;
            }
            else
            {
                if(start>0)
                {
                    start--;
                }
                else
                {
                    end++;
                }
            }
        }

        return start+end;
    }
}
