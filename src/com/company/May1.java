package com.company;

public class May1 {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0;i<word.length();i++)
        {
            if(ch==word.charAt(i))
            {
                index=i;
                break;
            }
        }
        if(index<0)
        {
            return word;
        }
        char[] res = word.toCharArray();
        for(int i=0;i<index/2+1;i++)
        {
            char temp=res[i];
            res[i]=res[index-i];
            res[index-i]=temp;
        }
        return new String(res);
    }
}
