package org.codes.codingplatforms.leet.january2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {
    List<List<Integer>> list=new ArrayList<>();

    public static void main(String[] args) {
        int t[][]=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZeroes d=new SetMatrixZeroes();
        d.setZeroes(t);
        System.out.println(d.list);
    }
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    List<Integer> k= Arrays.asList(i,j);
                    list.add(k);
                }
            }
        }
        for(List<Integer> l:list)
        {
            makeZeroes(l.get(0),l.get(1),matrix);
        }

    }
    private void makeZeroes(int m,int n,int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
                matrix[i][m]=0;
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[n][i]=0;
        }
    }
}
