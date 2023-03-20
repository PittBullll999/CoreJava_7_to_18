package org.codes.java.java8.typeandrepeatingannotation;

import lombok.NonNull;

public class TypeAnnotation {
    public static void main(String[] args) {
        @NonNull String s=null;
        System.out.println(s);
        Person person=new Person("Abhinav","Kerala");
        System.out.println(person.address());
        System.out.println(person.name());


    }
}
 record Person(String name,String address){}