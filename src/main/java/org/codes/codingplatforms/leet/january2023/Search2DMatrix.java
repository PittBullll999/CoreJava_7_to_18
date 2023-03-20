package org.codes.codingplatforms.leet.january2023;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] t=new int[3][4];
        t[0]= new int[]{1, 3, 5, 7};
        t[1]=new int[]{10,11,16,20};

        t[2]=new int[]{23,30,34,60};
        System.out.println(columnSerach(t,5,2,0));
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        return true;


    }
    private static int columnSerach(int[][] matrix,int target,int bottom,int up)
    {
        int mid=up+(int)Math.ceil((double) (bottom-up)/2);
        if(matrix[mid][0]==target||((matrix[mid][matrix[0].length-1]>target)&&target>matrix[mid][0]))
        {
            return mid;
        }
        if(matrix[mid][0]<target)
        {
            return columnSerach(matrix,target,bottom,mid);
        }
        return columnSerach(matrix,target,mid,up);
    }
    private boolean rowserach(int [][] matrix,int target)
    {
        return true;
    }

}
