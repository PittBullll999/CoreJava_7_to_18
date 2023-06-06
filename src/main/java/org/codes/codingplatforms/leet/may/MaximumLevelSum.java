package org.codes.codingplatforms.leet.may;

import org.codes.codingplatforms.leet.april.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class MaximumLevelSum {
    public int maxLevelSum(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        if(root==null)
        {
            return 0;
        }
        else {
            traversal(1,map,root);
        }
        int max=Integer.MIN_VALUE;
        int level=1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                level=entry.getKey();
            }
        }
        return level;


    }
    private void traversal(int level, Map<Integer,Integer> map,TreeNode node)
    {
        map.put(level,map.getOrDefault(level,0)+node.val);
        if(node.left!=null)
        {
            traversal(level+1,map,node.left);
        }
        if(node.right!=null)
        {
            traversal(level+1,map,node.right);
        }
    }
}
