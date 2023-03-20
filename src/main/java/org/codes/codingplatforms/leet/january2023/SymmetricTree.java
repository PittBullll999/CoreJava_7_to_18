package org.codes.codingplatforms.leet.january2023;

import java.util.*;

public class SymmetricTree {
    SortedMap<Integer,List<Integer>> map=new TreeMap<>();
    public boolean isSymmetric(TreeNode root) {
        traverse(root,0);
        int t[]=new int[map.size()];
        List<List<Integer>> list=new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet())
        {
            list.add(entry.getValue());

        }
        return true;




    }
    private void traverse(TreeNode root,int level)
    {
        if(root==null)
        {
            if(map.containsKey(level))
            {
                List<Integer> l=map.get(level);
                l.add(101);
                map.put(level,l);
            }
            else {
                List<Integer> l=new ArrayList<>();
                l.add(101);
                map.put(level,l);
            }
            return;
        }
        if(map.containsKey(level))
        {
            List<Integer> l=map.get(level);
            l.add(root.val);
            map.put(level,l);
        }
        else {
            List<Integer> l=new ArrayList<>();
            l.add(root.val);
            map.put(level,l);
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);

    }
    private boolean isSymmetry(List<Integer> list)
    {
        int t=list.size();
        for(int i=0;i<t;i++)
        {
            if(list.get(i)!= list.get(t-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
