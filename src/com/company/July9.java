package com.company;

public class July9 {
    public double averageWaitingTime(int[][] customers) {
        int curTime=customers[0][0]+customers[0][1];
        double timeSum=customers[0][1];
        for(int i=1;i<customers.length;i++)
        {
            if(curTime>customers[i][0])
            {
                timeSum+=curTime-customers[i][0];
                timeSum+=customers[i][1];
                curTime+=customers[i][1];
            }
            else
            {
                timeSum+=customers[i][1];
                curTime=customers[i][0]+customers[i][1];
            }
        }
        return timeSum/customers.length;
    }
}
