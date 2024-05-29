package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Jan1 {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length < 1) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int happyKids = 0;
        Stack<Integer> sStack = new Stack();
        for (int i = 0; i < s.length; i++) {
            sStack.push(s[i]);
        }
        int gLength = g.length;
        while (gLength > 0 && !sStack.isEmpty()) {
            if (sStack.peek() >= g[gLength - 1]) {
                happyKids += 1;
                sStack.pop();
            }
            gLength--;
        }
        return happyKids;
    }
}
