package com.company;

public class July7 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=0;
        int empty=0;
        while(numBottles>0)
        {
            if(empty>=numExchange)
            {
                numBottles+=1;
                empty-=numExchange;
            }
            empty+=numBottles%numExchange;
            res+=numBottles;
            numBottles/=numExchange;
        }
        return res+empty/numExchange;
    }
}
