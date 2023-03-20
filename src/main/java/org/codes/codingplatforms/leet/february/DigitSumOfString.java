package org.codes.codingplatforms.leet.february;


public class DigitSumOfString {
    public static void main(String[] args) {
        String s="1234";
        DigitSumOfString d=new DigitSumOfString();
        d.digitSum(s,2);
    }
    public String digitSum(String s, int k) {

        while (s.length()>k)
        {
            int n=s.length();

            int r=n%k;
            int i=0;
            StringBuilder b=new StringBuilder();
            for(i=0;i<n-r;i+=k)
            {
                b.append(clacSum(s.substring(i,i+k)));
            }
            if(r!=0)
            {
                b.append(clacSum(s.substring(i,i+r)));
            }

            System.out.println(b.toString());
            s=b.toString();


        }
        return s;
    }
    private String clacSum(String ss)
    {

        int sum=0;
        for(int i=0;i< ss.length();i++)
        {
            sum+=Character.getNumericValue(ss.charAt(i));
        }
        return String.valueOf(sum);
    }
}
