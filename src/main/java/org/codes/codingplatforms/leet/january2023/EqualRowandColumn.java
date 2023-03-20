package org.codes.codingplatforms.leet.january2023;

import javax.swing.plaf.IconUIResource;
import java.util.*;
import java.util.stream.Collectors;

public class EqualRowandColumn {
    public static void main(String[] args) {

        int t[][]=new int[][]{{3,2,1},{1,7,6},{2,7,7}};
        EqualRowandColumn e=new EqualRowandColumn();
        e.equalPairs(t);
                //[3,2,1],[1,7,6],[2,7,7]
    }
    public int equalPairs(int[][] grid) {

        HashMap<List<Integer>,Integer> h=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> l=new ArrayList<>();
            Arrays.stream(grid[i]).forEach(p->l.add(p));
            h.put(l,h.getOrDefault(l,0)+1);
        }
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++)
            {
                list.add(grid[j][i]);
            }
            if(h.containsKey(list))
            {
                count+=h.get(list);
            }



        }
        return count;

    }
}
