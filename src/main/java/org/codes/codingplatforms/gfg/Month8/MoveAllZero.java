package org.codes.codingplatforms.gfg.Month8;

public class MoveAllZero {
    public static void main(String[] args) {
        MoveAllZero.pushZerosToEnd(new int[]{0,0,0,0,4},5);
    }
    static void pushZerosToEnd(int[] arr, int n) {
        int zeroCount=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zeroCount+=1;
            }
        }
        int currPos=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[currPos]=arr[i];
                currPos+=1;
            }
        }
        for(int i=n-zeroCount;i<n;i++)
        {
            arr[i]=0;
        }
        int a=arr.length;
    }
}
