package org.codes.codingplatforms.googleQns;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int t[]=new int[]{1,4,20,3,10,5};
        SubArrayWithGivenSum s=new SubArrayWithGivenSum();
        s.findPos(t,33);


    }
    public String findPos(int[] array,int sum)
    {
        int n=array.length;
        int firstPos=0;
        int lastPos=0;
        boolean flag=true;
        int totsum=array[firstPos];
        while (lastPos<n&&flag)
        {
            if(totsum==sum)
            {
                flag=false;
            }

            if(totsum<sum)
            {

                lastPos=lastPos+1;
                totsum+=array[lastPos];
            }
            if(totsum>sum)
            {
                totsum-=array[firstPos];
                firstPos+=1;

            }

        }
        return("sum found between index"+firstPos+" and "+lastPos);

    }
}
