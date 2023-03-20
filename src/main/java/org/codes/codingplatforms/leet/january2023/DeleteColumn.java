package org.codes.codingplatforms.leet.january2023;

public class DeleteColumn {
    public static void main(String[] args) {
        String s[]=new String[]{"cba","daf","ghi"};
        DeleteColumn d=new DeleteColumn();
        System.out.println(d.minDeletionSize(s));
    }
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++)
        {

            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].charAt(i)<strs[j-1].charAt(i))
                {
                    count+=1;
                    break;
                }

            }

        }
        return count;

    }
//    private int checkLexic(String s)
//    {
//        if(s.length()==1)
//        {
//            return 0;
//        }
//        for(int i=1;i<s.length();i++)
//        {
//            if(s.charAt(i)<s.charAt(i-1))
//            {
//                return 1;
//            }
//        }
//        return 0;
//    }
}
