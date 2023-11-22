package org.codes.codingplatforms.gfg.Month8;

import java.util.ArrayList;

public class FirstAndLastOccuranceOfX {
    int leftMost;
    int rightMost;

    public static void main(String[] args) {
        FirstAndLastOccuranceOfX f=new FirstAndLastOccuranceOfX();
        long a[]=new long[]{1, 3, 5, 5, 5, 5, 67, 123, 125};
        f.find(a,9,5);
    }
    ArrayList<Long> find(long arr[], int n, int x)
    {
        leftMost=arr.length-1;
        rightMost=0;
        check(arr,0,arr.length-1,x);
        System.out.println(leftMost);
        System.out.println(rightMost);
        return null;
        // code here
    }
    void check(long arr[],int left,int right,int x)
    {
        if(left==right||left<0||right>arr.length-1)
        {
            return;
        }
        int mid=(right+left+1)/2;
        if(arr[mid]==x)
        {
            if(mid<leftMost)
            {
                leftMost=mid;
            }
            if(mid>rightMost)
            {
                rightMost=mid;
            }
            else {
                return;
            }
        }
        check(arr,left,mid-1,x);
        check(arr,mid+1,right,x);

    }
}
