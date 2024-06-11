package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class June11 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> arr1Map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            arr1Map.put(arr1[i],arr1Map.getOrDefault(arr1[i],0)+1);
        }
        int[] commonElements=new int[arr1.length];
        int counter=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1Map.get(arr2[i]);j++)
            {
                commonElements[counter]=arr2[i];
                counter++;
            }
            arr1Map.remove(arr2[i]);
        }
        int[] restElements=new int[arr1.length-counter];
        counter=0;
        for(int num : arr1Map.keySet())
        {
            for(int j=0;j<arr1Map.get(num);j++)
            {
                restElements[counter]=num;
                counter++;
            }
        }
        Arrays.sort(restElements);
        System.arraycopy(commonElements,0,arr1,0,arr1.length-counter);
        System.arraycopy(restElements,0,arr1,arr1.length-counter,counter);
        return arr1;
    }
}
