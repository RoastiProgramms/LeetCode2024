package com.company;

public class June3 {
    public int appendCharacters(String s, String t) {
        int count=t.length();
        int counter=0;
        for(int i=0;i<s.length();i++)
        {
            if(counter>=t.length())
            {
                break;
            }
            if(t.charAt(counter)==s.charAt(i))
            {
                counter++;
            }
        }
        return count-counter;
    }
}
