package org.codes.java.java17;

public class Records {
    public static void main(String[] args) {
        Student student=new Student("Abhinav","kerala",1L,"TVE18CS","Computer science and engineering");
        System.out.println(student.address());
        if(student.name().startsWith("A"))
        {
            System.out.println("The student name is start with letter A");
        }


    }
}


