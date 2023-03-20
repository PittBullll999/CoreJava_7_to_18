package org.codes.codingplatforms.leet.february;

public class AlternationBinaryNumber {
    public static void main(String[] args) {
        AlternationBinaryNumber a=new AlternationBinaryNumber();
        a.hasAlternatingBits(5);
    }
    public boolean hasAlternatingBits(int n) {
        int bef=n%2;
        n/=2;
        //
        while (n!=0)
        {

            int rem=n%2;
            if(rem==bef)
            {
                return false;
            }
            bef=rem;

            n/=2;
        }
        return true;

    }
}
