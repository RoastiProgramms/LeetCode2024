package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code heres
    }
}
class janfifteen{
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
        {
            return false;
        }
        HashMap<Character,Integer>w1=new HashMap<>();
        HashMap<Character,Integer>w2=new HashMap<>();
        HashSet<Character> s1=new HashSet<>();
        for(int i=0;i<word1.length();i++)
        {
            if(w1.containsKey(word1.charAt(i)))
            {
                w1.put(word1.charAt(i),w1.get(word1.charAt(i))+1);
            }
            else
            {
                w1.put(word1.charAt(i),1);
            }
            if(w2.containsKey(word2.charAt(i)))
            {
                w2.put(word2.charAt(i),w2.get(word2.charAt(i))+1);
            }
            else
            {
                w2.put(word2.charAt(i),1);
            }
            s1.add(word1.charAt(i));
        }
        for(int i=0;i<word2.length();i++)
        {
            if(!s1.contains(word2.charAt(i)))
            {
                return false;
            }
        }
        Integer[] valuesArray1 = new Integer[w1.size()];
        Integer[] valuesArray2 = new Integer[w2.size()];
        int index = 0;
        for (Integer value1 : w1.values()) {
            valuesArray1[index++] = value1;
        }
        index=0;
        for (Integer value2 : w2.values()) {
            valuesArray2[index++] = value2;
        }
        Arrays.sort(valuesArray1);
        Arrays.sort(valuesArray2);
        return Arrays.equals(valuesArray1, valuesArray2);
    }
}
