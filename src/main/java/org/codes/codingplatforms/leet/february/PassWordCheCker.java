package org.codes.codingplatforms.leet.february;

public class PassWordCheCker {
    public static void main(String[] args) {
        String p="AAbhinav@123";
        PassWordCheCker pp=new PassWordCheCker();
        System.out.println(pp.strongPasswordCheckerII(p));
    }
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8)
        {
            return false;
        }
        boolean lowerCase=false;
        boolean upperCase=false;
        boolean digit=false;
        boolean specialCase=false;
        for(int i=0;i<password.length();i++)
        {
            char t=password.charAt(i);
            String s="!@#$%^&*()-+";
            for(char p:s.toCharArray())
            {
                if(t==p)
                {
                    specialCase=true;
                }
            }
            if(t>47&&t<58)
            {
                digit=true;
            }
            if(t>96&&t<123)
            {
                lowerCase=true;
            }
            if(t>64&&t<91)
            {
                upperCase=true;
            }
            if(i!=0&&password.charAt(i)==password.charAt(i-1))
            {
                return false;
            }
        }
        return (digit&&lowerCase&&upperCase&&specialCase);


    }
}
