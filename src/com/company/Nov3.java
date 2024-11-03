package com.company;

public class Nov3 {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        String allComb=s+s;
        if(allComb.contains(goal))
        {
            return true;
        }
        return false;
    }
}
