package com.company;

public class Dec3 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        /*
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<spaces.length;i++)
        {
            hs.add(spaces[i]);
        }
        */
        int cur=0;
        for(int i=0;i<s.length();i++)
        {
            if(spaces[cur]==i)
            {
                sb.append(" ");
                if(cur<spaces.length-1)
                {
                    cur++;
                }
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
