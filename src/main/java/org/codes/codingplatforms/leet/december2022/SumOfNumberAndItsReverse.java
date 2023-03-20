package org.codes.codingplatforms.leet.december2022;

public class SumOfNumberAndItsReverse {
    public static void main(String[] args) {
        SumOfNumberAndItsReverse s=new SumOfNumberAndItsReverse();
        System.out.println(s.sumOfNumberAndReverse(181));
        System.out.println(s.reverse(140));
    }
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=1;i<(int) num/2+1;i++)
        {
            if(reverse(reverse(num-i))==reverse(i))
            {
                System.out.println(num-i+" and "+i);
                return true;
            }
        }
        return false;

    }
    private int reverse(int n)
    {
        String s=Integer.toString(n);
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        String p=input1.reverse().toString();
        return Integer.parseInt(p);
    }
}
