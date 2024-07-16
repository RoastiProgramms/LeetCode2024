package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class July2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nums=new HashMap<>();
        ArrayList<Integer> res=new ArrayList();
        for(int i=0;i<nums1.length;i++)
        {
            nums.put(nums1[i],nums.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(nums.containsKey(nums2[i]))
            {
                if(nums.get(nums2[i])>0)
                {
                    res.add(nums2[i]);
                    nums.put(nums2[i],nums.get(nums2[i])-1);
                }
            }
        }
        int[] result=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            result[i]=res.get(i);
        }
        return result;
    }
}
