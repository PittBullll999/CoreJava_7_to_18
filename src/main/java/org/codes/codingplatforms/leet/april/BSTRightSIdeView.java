package org.codes.codingplatforms.leet.april;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BSTRightSIdeView {
    Map<Integer,Integer> map=new HashMap<>();


    public List<Integer> rightSideView(TreeNode root) {
        traverse(root,0);
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            list.add(entry.getValue());
        }
        return list;

    }
    private void traverse(TreeNode node,int level)
    {
        if(!map.containsKey(level))
        {
            map.put(level,node.val);

        }
        if(node.right!=null)
        {
            traverse(node.right,level+1);
        }
        if(node.left!=null)
        {
            traverse(node.left,level+1);
        }
    }

}
