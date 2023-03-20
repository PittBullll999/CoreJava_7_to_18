package org.codes.codingplatforms.leet.february;

public class PercentageOfLetter {
    public static void main(String[] args) {
        PercentageOfLetter p=new PercentageOfLetter();
        System.out.println(p.percentageLetter("foobar",'o'));
    }
    public int percentageLetter(String s, char letter) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==letter)
            {
                count+=1;
            }
        }

        count=((count*100)/n);

        return (count);


    }
}
