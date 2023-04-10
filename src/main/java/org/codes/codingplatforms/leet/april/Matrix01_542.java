package org.codes.codingplatforms.leet.april;

import java.util.Arrays;

public class Matrix01_542 {
    public static void main(String[] args) {
        int k[][]=new int[][]{{0,0,0},{0,1,0},{1,1,1}};
        Matrix01_542 m=new Matrix01_542();
        m.updateMatrix(k);
    }
    public int[][] updateMatrix(int[][] mat) {
        int t[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<t.length;i++)
        {
            Arrays.fill(t[i],-1);
        }
        for(int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[0].length;j++)
            {
                mat[i][j]+=minDistance(t,mat,i,j);
            }
        }
        return mat;

    }
    private int minDistance(int[][] ref,int[][] ma,int i,int j)
    {
        System.out.println("reach "+i+" and "+j);
        if(i<0||j<0||j>=ma[0].length||i>=ma.length)
        {
            return Integer.MAX_VALUE;
        }
        if(ma[i][j]==0)
        {
            return 0;
        }
        else {
            int a=Math.min(minDistance(ref,ma,i-1,j),minDistance(ref,ma,i,j-1));
            if(a==0)
            {
                return 0;
            }
            int b=Math.min(a,minDistance(ref,ma,i+1,j));
            int c=Math.min(b,minDistance(ref,ma,i,j+1));
            return c;
        }
    }
}
