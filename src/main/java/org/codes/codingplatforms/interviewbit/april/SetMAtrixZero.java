package org.codes.codingplatforms.interviewbit.april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMAtrixZero {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        List<List<Integer>> pos=new ArrayList<>();

        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<a.get(0).size();j++)
            {
                if(a.get(i).get(j)==0)
                {
                    List<Integer> list=new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    pos.add(list);
                }
            }
        }
        for(int i=0;i<pos.size();i++)
        {
            List<Integer> list=pos.get(i);
            makeColumZero(a,list.get(0));
            makeCRowZero(a,list.get(1));
        }
    }
    private void makeColumZero(ArrayList<ArrayList<Integer>> a,int col)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.get(0).size();i++);
        {
            list.add(0);
        }
        for(int i=0;i<a.size();i++)
        {
            a.set(col,list);
        }
    }
    private void makeCRowZero(ArrayList<ArrayList<Integer>> a,int row)
    {

    }
}
