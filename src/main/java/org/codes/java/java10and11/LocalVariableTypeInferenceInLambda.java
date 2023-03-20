package org.codes.java.java10and11;
interface Cal
{
    int sum(int a,int b);
}
public class LocalVariableTypeInferenceInLambda {
    public static void main(String[] args) {
        Cal cal=(var a,var b)->a+b;
        int result=cal.sum(10,30);
        System.out.println(result);

    }
}
