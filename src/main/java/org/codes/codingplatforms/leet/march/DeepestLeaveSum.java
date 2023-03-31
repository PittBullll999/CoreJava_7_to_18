package org.codes.codingplatforms.leet.march;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class DeepestLeaveSum {
    SortedMap<Integer, List<Integer>> sortedMap=new TreeMap<>();
    int depth;


    public int deepestLeavesSum(TreeNode root) {

        int sum=0;
        findDepth(root,0);
        updateSum(root,sum,0);
        return sum;
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
    private void findDepth(TreeNode node,int level)
    {
        if(level>depth)
        {
            depth=level;
        }
        if(node.left!=null)
        {
            findDepth(node.left,level+1);
        }
        if(node.right!=null)
        {
            findDepth(node.right,level+1);
        }
    }
    private void updateSum(TreeNode node,int sum,int level)
    {
        if(level==depth)
        {
            sum+=node.val;
        }
        if(node.left!=null)
        {
            updateSum(node.left,sum,level+1);
        }
        if(node.right!=null)
        {
            updateSum(node.right,sum,level);
        }
    }

}
