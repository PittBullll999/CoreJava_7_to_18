package org.codes.codingplatforms.leet.january2023;

public class StudentAttendence {
    public static void main(String[] args) {
        String s="PPALLAP";
        StudentAttendence st=new StudentAttendence();
        System.out.println(st.checkRecord(s));
    }
    public boolean checkRecord(String s) {
            int a=0;
            if(s.charAt(0)=='A')
            {
                a+=1;
            }
            if(s.charAt(s.length()-1)=='A')
            {
                a+=1;
            }
            for(int i=1;i<s.length()-1;i++)
            {
                if(s.charAt(i)=='A')
                {
                    a+=1;
                }
                if(s.charAt(i)=='L')
                {
                    if(s.charAt(i-1)=='L'&&s.charAt(i+1)=='L')
                    {
                        return false;
                    }
                }
            }
            if(a>1)
            {
                return false;
            }
            return true;
    }
}
