package org.codes.codingplatforms.leet.april;

import java.util.*;

public class SlowestKey {
    public static void main(String[] args) {
        int t[]=new int[]{9,29,49,50};
        String s="cbcd";
        SlowestKey sk=new SlowestKey();
        sk.slowestKey(t,s);
    }
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        Character c=keysPressed.charAt(0);
        for(int i=0;i<releaseTimes.length-1;i++)
        {
            int t=releaseTimes[i+1]-releaseTimes[i];
            if(t>max)
            {
                c=keysPressed.charAt(i+1);
                max=t;
            }
            if(t==max)
            {
                if(c.compareTo(keysPressed.charAt(i+1))<1)
                {
                    c=keysPressed.charAt(i+1);
                }
            }
        }
        return c;

    }
}
