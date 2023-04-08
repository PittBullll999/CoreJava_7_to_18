package org.codes.codingplatforms.leet.april;

import javax.lang.model.util.Elements;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        Map<Integer, List<Integer>> map =new HashMap<>();
        traverse(root,0,map);
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet())
        {
            if(entry.getKey()%2==1)
            {
                if(!isDecreasing(entry.getValue()))
                {
                    return false;
                }
            }
            if(entry.getKey()%2==0)
            {
                if(!isIncreasing(entry.getValue()))
                {
                    return false;
                }
            }
        }
        return true;


    }
    private void traverse(TreeNode root,int level,Map<Integer,List<Integer>> map)
    {
        if(map.containsKey(level))
        {
            List<Integer> list=map.get(level);
            list.add(root.val);
            map.put(level,list);
        }
        else {
            List<Integer> list =new ArrayList<>();
            list.add(root.val);
            map.put(level,list);
        }
        if(root.left!=null)
        {
            traverse(root.left,level+1,map);
        }
        if(root.right!=null)
        {
            traverse(root.right,level+1,map);
        }
    }
    private boolean isIncreasing(List<Integer> list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
    private boolean isDecreasing(List<Integer> list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)<list.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}
