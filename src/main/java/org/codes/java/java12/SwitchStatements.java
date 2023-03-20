package org.codes.java.java12;

public class SwitchStatements {
    public static void main(String[] args) {
        String day="monday";
        switch (day)
        {
            case "wednesday","monday"-> System.out.println("Today you have  scrum meeting");
            case "saturday","sunday"-> System.out.println("today is hollyday");
            case "tuesday","thirsday", "friday"-> System.out.println("this is a normal working day");
        }
    }
}
