package org.codes.codingplatforms.leet.february;

import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestPathInMartrix {
    int[][] mem;
    int largestpath=0;

    public static void main(String[] args) {
        int [][] t=new int[][]{{3,4,5},{3,2,6},{2,2,1}};
        LongestPathInMartrix l=new LongestPathInMartrix();
        System.out.println(l.longestIncreasingPath(t));

    }
    public int longestIncreasingPath(int[][] matrix) {
        mem=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                mem[i][j]=(-1);
            }
        }
        int max=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                checkPath(i,j,matrix,-1);
            }
        }

        return largestpath-1;



    }
    private int checkPath(int i, int j,int[][] matrix,int prev)
    {
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length)
        {

        }
return 0;
    }
}
