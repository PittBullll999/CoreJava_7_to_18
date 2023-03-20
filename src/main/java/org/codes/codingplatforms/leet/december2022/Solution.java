package org.codes.codingplatforms.leet.december2022;

import java.util.*;

class Solution {
    HashMap<Double,Integer> hashMap=new HashMap<>();

    public static void main(String[] args) {
        int[] a={0,0};
        int[] b={1,1};
        int[] c={0,0};
        int[] d={1,1};
        Solution solution=new Solution();
        System.out.println(solution.validSquare(a,b,c,d));


    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        addToHashMap(findDistance(p1,p2));
        addToHashMap(findDistance(p2,p3));
        addToHashMap(findDistance(p3,p4));
        addToHashMap(findDistance(p4,p1));
        addToHashMap(findDistance(p1,p3));
        addToHashMap(findDistance(p2,p4));
        int[] l=new int[8];
        int i=0;
        for (Map.Entry<Double,Integer> element:hashMap.entrySet())
        {
            l[i]=element.getValue();

            i+=1;
            if(element.getKey()==0.0)
            {
                return false;
            }
        }

        if((l[0]==2&&l[1]==4)||(l[0]==4&&l[1]==2))
        {
            return true;
        }

        return false;


    }
    public double findDistance(int[] p1,int[] p2)
    {
        int k=p1[1]-p2[1];
        int t=p1[0]-p2[0];
        return(Math.sqrt((k*k)+(t*t)));
    }
    public void addToHashMap(double val)
    {
        if(hashMap.get(val)==null)
        {
            hashMap.put(val,1);
        }
        else
        {
            hashMap.replace(val,hashMap.get(val)+1);
        }
    }
}