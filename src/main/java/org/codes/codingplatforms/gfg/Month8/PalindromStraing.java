package org.codes.codingplatforms.gfg.Month8;

public class PalindromStraing {
    int isPalindrome(String S) {
        int l=S.length();
        for(int i=0;i<l/2;i++)
        {
            if(S.charAt(i)!=S.charAt(l-i-1))
            {
                return 0;
            }
        }
        return 1;
    }
}
