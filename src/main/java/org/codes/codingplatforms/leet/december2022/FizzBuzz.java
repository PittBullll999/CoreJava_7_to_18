package org.codes.codingplatforms.leet.december2022;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String s="";
            if(i%3==0)
            {
                s+="Fizz";
            }
            if(i%5==0)
            {
                s+="Buzz";
            }
            if(i%3!=0&&i%5!=0)
            {
                s+=Integer.toString(i);
            }
            list.add(s);
        }
        return list;

    }
}
