package org.codes.codingplatforms.leet.february;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    List<Integer> list=new ArrayList<>();
    int direction=1;
    public static void main(String[] args) {
        int[][] t=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        SpiralMatrix s=new SpiralMatrix();
        System.out.println(s.spiralOrder(t));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length*matrix[0].length;
        int i=0,j=0;
        while (n>0)
        {
            if(i<0)
            {
                i+=1;
                direction+=1;
            }
            if(j<0)
            {
                j+=1;
                i-=1;
                direction+=1;
            }
            if(i>=matrix.length)
            {
                i-=1;
                j-=1;
                direction+=1;
            }
            if(j>=matrix[0].length)
            {
                j-=1;
                i+=1;
                direction+=1;
            }
            if(matrix[i][j]==101)
            {

                direction+=1;
            }
            if(direction%4==1)
            {
                list.add(matrix[i][j]);
                matrix[i][j]=101;
                j=j+1;
                n-=1;
            }
            if(direction%4==2)
            {
                list.add(matrix[i][j]);
                matrix[i][j]=101;
                i+=1;
                n-=1;

            }
            if(direction%4==3)
            {
                list.add(matrix[i][j]);
                matrix[i][j]=101;
                j-=1;
                n-=1;

            }
            if(direction%4==0)
            {
                list.add(matrix[i][j]);
                matrix[i][j]=101;
                i-=1;
                n-=1;

            }


        }
        return list;

    }

}
