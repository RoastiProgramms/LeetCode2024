package com.company;

public class Aug15 {
        public boolean lemonadeChange(int[] bills) {
            int countFive=0;
            int countTen=0;
            for(int i=0;i<bills.length;i++)
            {
                if(bills[i]==5)
                {
                    countFive+=1;
                }
                else if(bills[i]==10)
                {
                    if(countFive<1)
                    {
                        return false;
                    }
                    else
                    {
                        countFive--;
                        countTen++;
                    }
                }
                else
                {
                    if(countTen<1)
                    {
                        if(countFive<3)
                        {
                            return false;
                        }
                        else
                        {
                            countFive-=3;
                        }
                    }
                    else
                    {
                        if(countFive<1)
                        {
                            return false;
                        }
                        else
                        {
                            countFive--;
                            countTen--;
                        }
                    }
                }

            }
            return true;
        }
}
