package org.codes.codingplatforms.codingninjas;

public class KthCharectorOfDevryptedString {
    public static void main(String[] args) {
        KthCharectorOfDevryptedString.kThCharaterOfDecryptedString("a2b3cd3",2l);
    }
    public static char kThCharaterOfDecryptedString(String s, Long k)
    {

        //a2b3cd3
        //8
        int lastPos=0;
        int currPos=-1;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            int p=(int) s.charAt(i);
            if(p >47&& (int)p <58)
            {
                lastPos=currPos;
                currPos=i;
                String m="";
                //System.out.println(s.substring(lastPos+1,currPos));
                int n=s.charAt(i)-48;
                for(int j=0;j<n;j++)
                {
                    m+=s.substring(lastPos+1,currPos);
                }
                str+=m;

            }


        }
        long kk=k;
        return str.charAt((int) kk);
    }
}
