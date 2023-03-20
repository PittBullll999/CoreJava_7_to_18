package org.codes.codingplatforms.leet.january2023;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueEmailAdress {
    public static void main(String[] args) {
        String[] emails=new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        UniqueEmailAdress u=new UniqueEmailAdress();
        u.numUniqueEmails(emails);
    }
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet=new HashSet<>();
        for(String em:emails)
        {
            hashSet.add(filterEmailAdress(em));
        }
        System.out.println(hashSet.toString());
        return hashSet.size();

    }
    private String filterEmailAdress(String email)
    {
        String[] s=email.split("@");
        String localName=s[0];
        String domainName=s[1];
        String[] dot=localName.split("\\.");
        String sample="";
        for(String str:dot)
        {
            sample+=str;
        }
        for(int i=0;i<sample.length();i++)
        {
            if(sample.charAt(i)=='+')
            {
                return sample.substring(0,i)+"@"+domainName;
            }
        }
        return sample+"@"+domainName;

    }

}
