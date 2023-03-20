package org.codes.codingplatforms.codingninjas;

import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class FirstPos {
    public static void main(String[] args) {
        int[] ints=new int[]{3,2,1,-6,0};
        firstMissing(ints,5);
    }
    public static int firstMissing(int[] arr, int n) {

        int[] hash=new int[Arrays.stream(arr).max().getAsInt()+2];
        Arrays.stream(arr).forEach(i->
        {
            if(i>-1)
            {
                hash[i]+=1;
            }
        });
        Arrays.stream(hash).forEach(System.out::println);

        for(int i=0;i<n;i++)
        {
            if(hash[i]==0)
            {
                System.out.println("This is the first positive number "+ i);
                return i;
            }
        }

        return 0;
    }
}
