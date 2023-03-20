package org.codes.algorithms;

public class KadanesAlgorithm {
    public static void main(String[] args)
    {
       int t[]=new int[]{1,2,-4,3,-2,-4,-1,1,7};

        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        KadanesAlgorithm k=new KadanesAlgorithm();
        System.out.println(k.maxSub(t));
    }
    private int maxSub(int a[])
    {
        int length=a.length;
        int max=0;
        int posmax=Integer.MIN_VALUE;
        for(int i=0;i<length;i++)
        {
            max+=a[i];
            if(max>posmax)
            {
                posmax=max;
            }
            if(max<0)
            {
                max=0;
            }

        }
        return posmax;
    }


}
