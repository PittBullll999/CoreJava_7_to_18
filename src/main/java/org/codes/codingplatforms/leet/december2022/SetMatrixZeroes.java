package org.codes.codingplatforms.leet.december2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0);
                {

                    list.add(Arrays.asList(i,j));
                }
            }
        }

    }
}
