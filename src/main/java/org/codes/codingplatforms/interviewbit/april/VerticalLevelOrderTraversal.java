package org.codes.codingplatforms.interviewbit.april;

import java.util.*;

public class VerticalLevelOrderTraversal {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        SortedMap<Integer, ArrayList<Integer>> map=new TreeMap<>();
        traverse(A,0,map);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet())
        {
            list.add(entry.getValue());
        }
        return list;

    }
    public void traverse(TreeNode node,int level,SortedMap<Integer,ArrayList<Integer>> map)
    {
        if(map.containsKey(level))
        {
            ArrayList<Integer> list=map.get(level);
            list.add(node.val);
            map.put(level,list);
        }
        else {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(node.val);
            map.put(level,list);
        }
        if(node.left!=null)
        {
            traverse(node.left,level-1,map);
        }
        if(node.right!=null)
        {
            traverse(node.right,level+1,map);
        }
    }
}
