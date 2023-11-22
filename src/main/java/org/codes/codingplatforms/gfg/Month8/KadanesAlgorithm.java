package org.codes.codingplatforms.gfg.Month8;

public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n){

        int allMax=Integer.MIN_VALUE;
        int currMax=0;
        for(int i=0;i<arr.length;i++)
        {
            currMax+=arr[i];
            if(currMax>allMax)
            {
                allMax=currMax;
            }
            if(currMax<0)
            {
                currMax=0;
            }
        }
        return allMax;
    }

}
