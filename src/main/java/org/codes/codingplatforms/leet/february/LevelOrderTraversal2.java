package org.codes.codingplatforms.leet.february;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class LevelOrderTraversal2 {
    SortedMap<Integer,List<Integer>> map=new TreeMap<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>> newlist=new ArrayList<>();
        while (map.size()>0)
        {
            List<Integer> list=map.remove(map.lastKey());
            newlist.add(list);
        }
        return newlist;


    }
    private void traverse(TreeNode node,int level)
    {
            if(map.containsKey(level))
            {
                List<Integer> list=map.get(level);
                list.add(node.val);
                map.put(level,list);
            }
            else {
                List<Integer> list=new ArrayList<>();
                list.add(node.val);
                map.put(level,list);
            }
            if(node.left!=null)
            {
                traverse(node.left,level+1);
            }
            if(node.right!=null)
            {
                traverse(node.right,level+1);
            }
    }
}
