package com.company;

import java.util.HashMap;

public class June4 {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> sMap=new HashMap<>();
        int totalCount=0;
        boolean isOdd=false;
        for(int i=0;i<s.length();i++)
        {
            if(!sMap.containsKey(s.charAt(i)))
            {
                sMap.put(s.charAt(i),1);
            }
            else
            {
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            }
        }
        for(Integer i : sMap.values())
        {
            if(i%2==0)
            {
                totalCount+=i;
            }
            else
            {
                isOdd=true;
                totalCount+=i-1;
            }
        }
        if(isOdd)
        {
            return totalCount+1;
        }
        return totalCount;

    }
}
