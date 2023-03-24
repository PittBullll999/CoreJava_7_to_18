package org.codes.codingplatforms.leet.march;

public class ThreeSameDigitNumber2264 {
    public static void main(String[] args) {
        ThreeSameDigitNumber2264 t=new ThreeSameDigitNumber2264();
        t.largestGoodInteger("6777133339");
    }
    public String largestGoodInteger(String num) {
        String max="";
        for(int i=0;i<num.length()-3+1;i++)
        {
            String s=num.substring(i,i+3);
            if(isSame(s))
            {
                
                if(max.equals(""))
                {
                    max=s;
                }
                else {
                    if(Integer.valueOf(max.charAt(0))<Integer.valueOf(s.charAt(0)))
                    {
                        max=s;
                    }
                }
            }

        }
        return max;

    }
    private boolean isSame(String n)
    {
        return ((n.charAt(0)==n.charAt(1))&&(n.charAt(2)==n.charAt(1)));
    }
}
