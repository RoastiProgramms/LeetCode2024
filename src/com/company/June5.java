package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class June5 {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> firstWord=new HashMap<>();

        for(int i=0;i<words[0].length();i++)
        {
            firstWord.put(words[0].charAt(i), firstWord.getOrDefault(words[0].charAt(i), 0) + 1);
        }
        for(int i=1;i<words.length;i++)
        {
            HashMap<Character,Integer> nextWord=new HashMap<>();
            for(int j=0;j<words[i].length();j++)
            {
                nextWord.put(words[i].charAt(j), nextWord.getOrDefault(words[i].charAt(j), 0) + 1);
            }
            List<Character> keysToRemove = new ArrayList<>();
            for(Character c : firstWord.keySet())
            {
                if(!nextWord.containsKey(c))
                {
                    keysToRemove.add(c);
                }
                else
                {
                    firstWord.put(c,Math.min(firstWord.get(c),nextWord.get(c)));
                }
            }
            for (Character c : keysToRemove) {
                firstWord.remove(c);
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Character c : firstWord.keySet()) {
            for(int i=0;i<firstWord.get(c);i++)
            {
                stringList.add(c.toString());
            }
        }
        return stringList;
    }
}
