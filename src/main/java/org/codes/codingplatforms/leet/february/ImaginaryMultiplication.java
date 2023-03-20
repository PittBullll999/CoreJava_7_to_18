package org.codes.codingplatforms.leet.february;

public class ImaginaryMultiplication {
    public static void main(String[] args) {
        String num1="1+1i";
        String num2="1+1i";
        ImaginaryMultiplication i=new ImaginaryMultiplication();
        System.out.println(i.complexNumberMultiply(num1,num2));
    }
    public String complexNumberMultiply(String num1, String num2) {
        String[] n1=num1.split("\\+");
        String[] n2=num2.split("\\+");
        int a=Integer.parseInt(n1[0]);
        int b=Integer.parseInt(n1[1].substring(0,n1[1].length()-1));
        int c=Integer.parseInt(n2[0]);
        int d=Integer.parseInt(n2[1].substring(0,n2[1].length()-1));
        int realResult=(a*c)+(-1*(b*d));
        int imaginaryResult=((a*d)+(b*c));
        String real=String.valueOf(realResult);
        String imagi=String.valueOf(imaginaryResult);
        return  (real+"+"+imagi+"i");




    }
}
