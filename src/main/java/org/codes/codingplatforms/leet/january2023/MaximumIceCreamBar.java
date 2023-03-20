package org.codes.codingplatforms.leet.january2023;

import java.util.Arrays;
import java.util.List;

public class MaximumIceCreamBar {
    public static void main(String[] args) {
        int t[]=new int[]{3};
        maxIceCream(t,2);
    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int count=0;
        if(costs[i]>coins)
        {
            return 0;
        }
        while (i<costs.length&&costs[i]<=coins)
        {
            coins-=costs[i];
            i+=1;
        }

        return i;


    }
}
