package org.codes.codingplatforms.leet.february;

public class RmvDigFrmNumToMax {
    public static void main(String[] args) {
        String number="2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471";
        Character d='3';
        RmvDigFrmNumToMax r=new RmvDigFrmNumToMax();
        System.out.println(r.removeDigit(number,d));
    }
    public String removeDigit(String number, char digit) {
        double max=0D;
        if(number.charAt(0)==digit&&max<Integer.parseInt(number.substring(1,number.length())))
        {
            max=Double.parseDouble(number.substring(1,number.length()));
        }
        for(int i=1;i<number.length()-1;i++)
        {
            if(number.charAt(i)==digit)
            {
                Double t=Double.parseDouble(number.substring(0,i)+number.substring(i+1,number.length()));
                if(t>max)
                {
                    max=t;
                }
            }
        }
        if(number.charAt(number.length()-1)==digit&&max<Integer.parseInt(number.substring(0,number.length()-1)))
        {
            max=Double.parseDouble(number.substring(0,number.length()-1));
        }
        String tt=Double.toString(max);
        return tt.substring(0,tt.length()-2);
    }


}
