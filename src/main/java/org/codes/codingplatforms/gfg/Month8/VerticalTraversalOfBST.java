package org.codes.codingplatforms.gfg.Month8;


import org.codes.codingplatforms.gfg.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class VerticalTraversalOfBST {
    static ArrayList<Integer> verticalOrder(Node root)
    {
        SortedMap<Integer, List<Integer>> map=new TreeMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        traverse(root,0,map);
        for (Map.Entry<Integer,List<Integer>> entry:map.entrySet())
        {
            list.addAll(entry.getValue());
        }
        return list;


    }
    static void traverse(Node node,int level,SortedMap<Integer,List<Integer>> map)
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
            traverse(node.left,level-1,map);
        }
        if(node.right!=null)
        {
            traverse(node.right,level+1,map);
        }
    }
}
