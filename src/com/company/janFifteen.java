package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class janFifteen {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> losers=new HashSet<>();
        HashSet<Integer> manyLosses=new HashSet<>();
        HashSet<Integer> winners=new HashSet<>();
        List<List<Integer>> answers=new ArrayList();
        List<Integer> answer1= new ArrayList();
        List<Integer> answer2= new ArrayList();
        for(int i=0;i<matches.length;i++)
        {
            if(losers.contains(matches[i][1]))
            {
                manyLosses.add(matches[i][1]);
            }
            else
            {
                losers.add(matches[i][1]);
            }
            winners.add(matches[i][0]);
        }

        for(int num: winners)
        {
            if(!losers.contains(num))
            {
                answer1.add(num);
            }
        }
        for(int num: manyLosses)
        {
            if(losers.contains(num))
            {
                losers.remove(num);
            }
        }
        for(int num: losers)
        {
            answer2.add(num);
        }
        Integer[] myArray = answer1.toArray(new Integer[answer1.size()]);
        Arrays.sort(myArray);
        answers.add(Arrays.asList(myArray));
        Integer[] myArray2 = answer2.toArray(new Integer[answer2.size()]);
        Arrays.sort(myArray2);
        answers.add(Arrays.asList(myArray2));
        return answers;
    }
}
