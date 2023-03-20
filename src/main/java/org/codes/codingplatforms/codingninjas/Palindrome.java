package org.codes.codingplatforms.codingninjas;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        p.checkPalindrome("N2 i&nJA?a& jnI2n");
    }
    public boolean checkPalindrome(String str) {
        String s="";

        for(char c:str.toCharArray())
        {
            if((c>=48&&c<=57)||(c>64&&c<91)||(c>96&&c<123))
            {
                s+=c;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;

    }
}
