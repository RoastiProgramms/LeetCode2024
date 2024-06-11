package com.company;

import java.util.HashSet;
import java.util.List;

public class June7 {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> dict=new HashSet<>();
        dict.addAll(dictionary);
        String[] sent=sentence.split(" ");
        for(int i=0;i<sent.length;i++)
        {
            for(String word : dict)
            {
                if(sent[i].startsWith(word))
                {
                    sent[i]=word;
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<sent.length;i++)
        {

            sb.append(sent[i]);
            if(i==sent.length-1)
            {
                break;
            }
            sb.append(" ");
        }
        return sb.toString();

    }
}
