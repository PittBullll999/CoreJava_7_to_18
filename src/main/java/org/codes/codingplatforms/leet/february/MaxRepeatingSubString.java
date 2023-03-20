package org.codes.codingplatforms.leet.february;

public class MaxRepeatingSubString {
    public static void main(String[] args) {
        MaxRepeatingSubString m=new MaxRepeatingSubString();
        m.maxRepeating("ababa","ab");
    }
    public int maxRepeating(String sequence, String word) {
        int num=0;
        for(int i=0;i<sequence.length()-word.length()+1;i++)
        {
            if((sequence.substring(i,i+word.length()).equals(word)))
            {
                num+=1;
            }
        }
        System.out.println(num);
        return num;
    }
}
