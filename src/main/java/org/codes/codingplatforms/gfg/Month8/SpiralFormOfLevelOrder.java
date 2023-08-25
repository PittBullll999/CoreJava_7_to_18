package org.codes.codingplatforms.gfg.Month8;

import org.codes.codingplatforms.gfg.Node;
import org.codes.codingplatforms.leet.march.LeafSimiliarTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpiralFormOfLevelOrder {
    ArrayList<Integer> findSpiral(Node root)
    {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        traverse(root,0,map);
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet())
        {
            if(entry.getKey()%2==0)
            {
                list.addAll(entry.getValue());
            }
            else {
                List<Integer> list1=entry.getValue();
                Collections.reverse(list1);
                list.addAll(list1);
            }
        }
        return list;
    }
    private void traverse(Node node, int level, HashMap<Integer, List<Integer>> map)
    {
        if(!map.containsKey(level))
        {
            List<Integer> list=new ArrayList<>();
            list.add(node.data);
            map.put(level,list);
        }
        else {
            List<Integer> list=map.get(level);
            list.add(node.data);
            map.put(level,list);
        }
        if(node.left!=null)
        {
            traverse(node.left,level+1,map);
        }
        if (node.right!=null)
        {
            traverse(node.right,level+1,map);
        }
    }
}
