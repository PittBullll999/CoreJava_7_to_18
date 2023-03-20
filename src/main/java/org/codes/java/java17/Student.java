package org.codes.java.java17;

import java.util.Objects;

public record Student(String name, String address, Long rollnum, String departmentId, String departmentName){
    public static String Unknow_Address="Unknown";
    public Student{
        Objects.requireNonNull(departmentId);
        Objects.requireNonNull(rollnum);
    }






}
