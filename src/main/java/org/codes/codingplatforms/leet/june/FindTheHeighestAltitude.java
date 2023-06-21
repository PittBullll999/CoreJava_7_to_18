package org.codes.codingplatforms.leet.june;

public class FindTheHeighestAltitude {
    public static void main(String[] args) {
        int t[]=new int[]{-5,1,5,0,-7};
        FindTheHeighestAltitude f=new FindTheHeighestAltitude();
        f.largestAltitude(t);
    }
    public int largestAltitude(int[] gain) {
        int heighest=0;
        int t[]=new int[gain.length+1];
        for(int i=1;i<t.length;i++)
        {
            t[i]=t[i-1]+gain[i-1];
            if(t[i]>heighest)
            {
                heighest=t[i];
            }
        }
        return heighest;

    }
}
