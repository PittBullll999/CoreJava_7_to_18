package org.codes.codingplatforms.hackerrank.march;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println();}
    public static int superDigit(String n, int k) {


        int sum=0;
        for(int i=0;i<n.length();i++)
        {

            sum+=i-48;
        }
        if(sum>10)
        {
            sum=superDigit(Integer.toString(sum),k);
        }
        else{
            sum=sum*k;
            if(sum>10) {
                sum = superDigit(Integer.toString(sum), 1);
            }
        }
        return sum;


    }

}
