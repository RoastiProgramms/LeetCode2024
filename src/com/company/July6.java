package com.company;

public class July6 {
    public int passThePillow(int n, int time) {
        time%=n*2-2;
        if(time<n)
        {
            return time+1;
        }
        if(time>n)
        {
            return n*2-1-time;
        }
        return time-1;
    }
}
