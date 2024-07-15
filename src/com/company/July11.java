package com.company;

public class July11 {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder(s);
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)==')')
            {
                int id2=i-1;
                int id1=id2;
                while(res.charAt(id1)!='(')
                {
                    id1--;
                }
                res=new StringBuilder(swaping(res.toString(),id1+1,id2));
                res.deleteCharAt(id1);
                res.deleteCharAt(id2);
                i-=2;
            }
        }
        return res.toString();
    }
    public String swaping(String str,int id1,int id2)
    {
        StringBuilder sb=new StringBuilder(str);
        while(id1<id2)
        {
            char temp=sb.charAt(id1);
            sb.setCharAt(id1,sb.charAt(id2));
            sb.setCharAt(id2,temp);
            id1++;
            id2--;
        }
        return sb.toString();
    }
}
