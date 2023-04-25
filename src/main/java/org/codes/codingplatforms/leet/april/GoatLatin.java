package org.codes.codingplatforms.leet.april;

public class GoatLatin {
    public static void main(String[] args) {
        String s="I speak Goat Latin";
        GoatLatin g=new GoatLatin();
        g.toGoatLatin(s);
    }
    public String toGoatLatin(String sentence) {
        String [] s=sentence.split(" ");
        String res="";
        for(int i=0;i<s.length;i++)
        {
            res=res.join(" ",res,makeString(s[i],i+1));
        }
        return res.trim();


    }
    private String makeString(String s,int countOfA)
    {
        String st=s;
        char[] vow=new char[]{'a','e','i','o','u','A','E','I','O','U'};
        String a="";
        for(int i=0;i<countOfA;i++)
        {
            a+="a";
        }
        for(char c:vow)
        {
            if(c==s.charAt(0))
            {
                return st+"ma"+a;
            }
        }
        return s.substring(1,s.length())+s.charAt(0)+"ma"+a;
    }
}
