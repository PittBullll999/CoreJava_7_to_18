package org.codes.codingplatforms.leet.february;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class LargestValueInTreeRow {
    SortedMap<Integer,Integer> sortedMap=new TreeMap<>();
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();

        while (sortedMap.size()>0)
        {
            list.add(sortedMap.remove(sortedMap.firstKey()));
        }
        return list;

    }
    private void getLargest(TreeNode node,int level)
    {
        if(sortedMap.containsKey(level))
        {
            if(sortedMap.get(level)<node.val)
            {
                sortedMap.put(level,node.val);
            }
            else {
                sortedMap.put(level,node.val);
            }
        }
        if(node.left!=null)
        {
            getLargest(node.left,level+1);
        }
        if(node.right!=null)
        {
            getLargest(node.right,level+1);
        }
    }

}
