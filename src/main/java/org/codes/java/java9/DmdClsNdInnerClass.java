package org.codes.java.java9;
abstract class MathFunctions<T>{//here the T can be any datatype

    abstract T add(T n,T m);
}

public class DmdClsNdInnerClass {
    public static void main(String[] args) {
        MathFunctions <Integer> mathFunctions=new MathFunctions<Integer>() {
            @Override
            Integer add(Integer n, Integer m) {
                return n+m;
            }
        };
        MathFunctions<String> stringMathFunctions=new MathFunctions<String>() {
            @Override
            String add(String n, String m) {
                return n+m;
            }
        };
        System.out.println(mathFunctions.add(20,30));
        System.out.println(stringMathFunctions.add("abhinav"," Raj"));

    }


}
