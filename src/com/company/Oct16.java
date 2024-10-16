package com.company;

public class Oct16 {
    public String longestDiverseString(int a, int b, int c) {
        int aCount=0;
        int bCount=0;
        int cCount=0;
        StringBuilder sb=new StringBuilder();
        int i=0;
        int maxLen=a+b+c;
        while(i<maxLen)
        {
            if(aCount<2&&a>=b&&a>=c||a>0&&(bCount>=2||cCount>=2))
            {
                sb.append("a");
                a--;
                aCount++;
                bCount=0;
                cCount=0;
            }
            else if(bCount<2&&a<=b&&b>=c||b>0&&(aCount>=2||cCount>=2))
            {
                sb.append("b");
                b--;
                bCount++;
                aCount=0;
                cCount=0;
            }
            else if(cCount<2&&a<=c&&b<=c||c>0&&(aCount>=2||bCount>=2))
            {
                sb.append("c");
                c--;
                cCount++;
                bCount=0;
                aCount=0;
            }
            i++;
        }
        return sb.toString();
    }
}
