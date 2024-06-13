package com.company;

import java.util.Arrays;

public class June13 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int diff=0;
        for(int i=0;i<students.length;i++)
        {
            diff+=Math.abs(seats[i]-students[i]);
        }
        return diff;
    }
}
