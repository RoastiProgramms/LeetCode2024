package com.company;

public class Nov4 {
    public String compressedString(String word) {
        StringBuilder comp=new StringBuilder();
        char curChar=word.charAt(0);
        int counter=1;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)==curChar&&counter<9)
            {
                counter++;
            }
            else
            {
                comp.append(counter);
                comp.append(curChar);
                counter=1;
                curChar=word.charAt(i);
            }
        }
        comp.append(counter);
        comp.append(curChar);
        return comp.toString();
    }
}
