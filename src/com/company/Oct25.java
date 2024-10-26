package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Oct25 {
    public List<String> removeSubfolders(String[] folder) {
        HashSet<String> foldersMap=new HashSet<>();
        Arrays.sort(folder);
        for(int i=0;i<folder.length;i++)
        {
            Boolean isSub=false;
            for(String folders : foldersMap)
            {
                if(folder[i].startsWith(folders+"/"))
                {
                    isSub=true;
                    break;
                }
            }
            if(!isSub)
            {
                foldersMap.add(folder[i]);
            }
        }
        return new ArrayList<>(foldersMap);
    }
}
