package org.codes.codingtechnique.dynamicprogramming;

import java.util.HashMap;

interface Grid
{
    int travel(int n,int m);
}
public class GridTraveller {
    HashMap<String,Long> hashMap=new HashMap<>();
    public static void main(String[] args) {
        GridTraveller gridTraveller=new GridTraveller();

        System.out.println(gridTraveller.gridtravel(50,50));//858110510779117752
        System.out.println(gridTraveller.gridtravel(60,50));
        System.out.println(gridTraveller.gridtravel(70,50));
        System.out.println(gridTraveller.gridtravel(80,50));
        System.out.println(gridTraveller.gridtravel(100,50));
       System.out.println(15+","+54);

    }
    private Long gridtravel(int a,int b)
    {
        String key1=a+","+b;
        String key2=b+","+a;
        if(hashMap.containsKey(key1))
        {
            return hashMap.get(key1);
        }
        if(hashMap.containsKey(key2))
        {
            return hashMap.get(key2);
        }
        if(a==1&&b==1)
        {
            return 1L;

        }
        if(a==0||b==0)
        {
            return 0L;
        }
        hashMap.put(key1,gridtravel(a-1,b)+gridtravel(a,b-1));
        hashMap.put(key2,hashMap.get(key1));
        return hashMap.get(key1);
    }
}
