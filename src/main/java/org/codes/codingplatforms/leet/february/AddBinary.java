package org.codes.codingplatforms.leet.february;

public class AddBinary {
    public static void main(String[] args) {
        String a="101";
        String b="100";
        AddBinary aa=new AddBinary();
        aa.addBinary(a,b);
    }
    public String addBinary(String a, String b) {
        int num1=Integer.parseInt(a,2);
        int num2=Integer.parseInt(b,2);

        return Integer.toBinaryString(num1+num2);


    }
}
