package org.codes.codingplatforms.leet.december2022;

public class CheckValidMatrix {
    public static void main(String[] args) {
        int[][] s=new int[][]{{1,2,3},{3,1,2},{2,3,1}};
        CheckValidMatrix c=new CheckValidMatrix();
        System.out.println(c.checkValid(s));

    }
    public boolean checkValid(int[][] matrix) {
        return (checkRows(matrix)&&checkColumn(matrix));

    }
    private boolean checkRows(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            int t[]=new int[matrix.length+1];
            for(int j=0;j<matrix[0].length;j++)
            {
                if(t[matrix[i][j]]>0)
                {
                    return false;
                }
                else{
                    t[matrix[i][j]]+=1;
                }

            }
        }
        return true;
    }
    private boolean checkColumn(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            int t[]=new int[matrix.length+1];
            for(int j=0;j<matrix[0].length;j++)
            {
                if(t[matrix[j][i]]>0)
                {
                    return false;
                }
                else{
                   t[matrix[j][i]]+=1;
                }

            }

        }
        return true;
    }
}
