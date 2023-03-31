package org.codes.codingplatforms.leet.march;

public class SortKthScore2545 {

    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i< score.length;i++)
        {
            int m=score[0].length;
            for(int j=i+1;j< score.length;j++)
            {
                if(score[i][k]>score[j][k])
                {
                    int t[]=new int[m];
                    t=score[i];
                    score[i]=score[j];
                    score[j]=t;
                }
            }
        }
        return score;

    }
}
//    int m=score[0].length;
//            if(score[i][k]>score[i+1][k])
//                    {
//                    int t[]=new int[m];
//                    t=score[i];
//                    score[i]=score[i+1];
//                    score[i+1]=t;
//                    }