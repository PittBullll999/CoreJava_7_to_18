package org.codes.codingplatforms.leet.december2022;

import java.util.ArrayList;
import java.util.List;

public class SelfDevidingNumbers {
    public static void main(String[] args) {
        SelfDevidingNumbers s=new SelfDevidingNumbers();
        s.selfDividingNumbers(1,100).stream().forEach(System.out::println);

    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(checkNumber(i))
            {
                list.add(i);
            }
        }

        return list;
    }
    private  boolean checkNumber(int n)
    {
        int number=n;
        while (number > 0) {


            int remainder = number % 10;
            if(remainder==0 ||(remainder!=0 && n%remainder!=0))
            {
                return false;
            }


            //System.out.println(remainder);


            number = number / 10;
        }
        return true;
    }
}
