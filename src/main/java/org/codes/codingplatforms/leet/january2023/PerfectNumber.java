package org.codes.codingplatforms.leet.january2023;

public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNumber p=new PerfectNumber();
        p.checkPerfectNumber(28);
    }
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num%2==0)
        {
            sum+=(int)(num/2);
        }
        if(num%3==0)
        {
            sum+=(int)(num/3);
        }
        for(int i=1;i<=(int)(num/4);i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
        return sum==num;
    }
}
