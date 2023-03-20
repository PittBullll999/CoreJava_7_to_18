package org.codes.codingplatforms.leet.december2022;

import java.util.Arrays;
import java.util.Random;

public class GoogleQn {
    public static void main(String[] args) {
        int[] r=new int[10000];
        Random random=new Random();
        for(int i=0;i<10000;i++)
        {
            r[i]=random.nextInt(2,100);
        }
        r[9999]=34;
        Arrays.stream(r).forEach(i-> System.out.print(i+" "));
        Arrays.stream(r).filter(i->i!=0);
        long now=System.currentTimeMillis();
        GoogleQn googleQn=new GoogleQn();
        googleQn.cal(r);
        long after=System.currentTimeMillis();
        System.out.println(after-now);
        long now1=System.currentTimeMillis();
        googleQn.normal(r);
        long after1=System.currentTimeMillis();
        System.out.println(after1-now1);





    }
    private int[] cal(int[] t)
    {
        int[] k=new int[t.length];
        int[] p=new int[t.length];
        int n=t.length;
        k[0]=t[0];
        p[t.length-1]=t[t.length-1];
        int i=1;
        for(i=1;i<t.length-1;i++)
        {
            k[i]=k[i-1]*t[i];
            p[n-i-1]=p[n-i]*t[n-i-1];
        }
        k[i]=k[i-1]*t[i];
        p[0]=p[1]*t[0];
        int[] q=new int[n];
        q[0]=p[1];
        for(int j=1;j<n-1;j++)
        {
            q[j]=k[j-1]*p[j+1];
        }
        q[n-1]=k[n-2];
//        Arrays.stream(q).forEach(System.out::println);
        return k;
    }
    private int[] normal(int[] k)
    {
        int m[]=new int[k.length];
        int mul= Arrays.stream(k).reduce(1,(a,b)->a*b);
        for(int i=0;i<k.length;i++)
        {
            m[i]=(int) (mul/k[i]);
        }

        return m;
    }
}
