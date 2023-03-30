package org.codes.codingplatforms.leet.march;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class DeepestLeaveSum {
    SortedMap<Integer, List<Integer>> sortedMap=new TreeMap<>();
    public int deepestLeavesSum(TreeNode root) {
        traverse(root,0);
        return sortedMap.get(sortedMap.lastKey()).stream().reduce(0, (a, b) -> a + b);

    }
    private void traverse(TreeNode node,int level)
    {
        if(sortedMap.containsKey(level))
        {
            List<Integer> list=sortedMap.get(level);
            list.add(node.val);
            sortedMap.put(level,list);
        }
        else {
            List<Integer> list=new ArrayList<>();
            list.add(node.val);
            sortedMap.put(level,list);
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
