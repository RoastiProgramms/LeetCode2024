package com.company;

public class Aug19 {
    public int minSteps(int n) {
        int steps=0;
        int temp=2;
        while(n>1)
        {
            while(n%temp==0)
            {
                steps+=temp;
                n/=temp;
            }
            temp++;
        }
        return steps;
    }
}
