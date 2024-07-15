package com.company;

public class July12 {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb=new StringBuilder(s);
        int res=0;
        int big,small;
        char prio,sec;
        if(x>=y)
        {
            big=x;
            small=y;
            prio='a';
            sec='b';
        }
        else
        {
            big=y;
            small=x;
            prio='b';
            sec='a';
        }
        int seq=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==prio)
            {
                seq=0;
                while(i<sb.length()&&(sb.charAt(i)==prio||sb.charAt(i)==sec))
                {
                    if(sb.charAt(i)==prio)
                    {
                        seq+=1;
                    }
                    if(sb.charAt(i)==sec&&seq>0)
                    {
                        seq-=1;
                        res+=big;
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i-1);
                        i-=2;
                    }
                    i++;
                }
            }
        }
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==sec)
            {
                seq=0;
                while(i<sb.length()&&(sb.charAt(i)==prio||sb.charAt(i)==sec))
                {
                    if(sb.charAt(i)==sec)
                    {
                        seq+=1;
                    }
                    if(sb.charAt(i)==prio&&seq>0)
                    {
                        seq-=1;
                        res+=small;
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i-1);
                        i-=2;
                    }
                    i++;
                }
            }
        }
        return res;
    }
}
