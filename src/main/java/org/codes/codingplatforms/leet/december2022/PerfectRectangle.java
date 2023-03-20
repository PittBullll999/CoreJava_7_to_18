package org.codes.codingplatforms.leet.december2022;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PerfectRectangle {
    public static void main(String[] args) {
        int[] a=new int[]{4,3,2,6};



    }
    public  int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int t=i*nums[j];
                if(i>0&&j>0)
                {
                    a[i][j]=a[i-1][j-1]+t;
                }
                else {
                    a[i][j]=t;
                }
            }
        }

        int[] su=new int[n];
        su[0]=a[n-1][n-1];
        int x=n-1;
        int y=n-1;
        for(int i=1;i<n;i++)
        {
            x=(x+1)%n;
            y=y-1;
            su[i]=a[n-1][y]+a[x][n-1];
        }
         return Arrays.stream(su).max().getAsInt();



    }

}
