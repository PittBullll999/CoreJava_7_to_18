package org.codes.codingplatforms.gfg.Month8;

import org.codes.codingplatforms.gfg.Node;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class TopViewOfBST {
     static ArrayList<Integer> topView(Node root)
    {
        SortedMap<Integer,Integer> map=new TreeMap<>();
        traverse(root,0,map);
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer key:map.keySet())
        {
            list.add(map.get(key));
        }
        return list;

    }
    static void traverse(Node node, int level, SortedMap<Integer,Integer> map)
    {
        if(!map.containsKey(level))
        {
            map.put(level,node.data);
        }
        if(node.left!=null)
        {
            traverse(node.left,level-1,map);
        }
        if (node.right!=null)
        {
            traverse(node.right,level+1,map);
        }
        return;
    }
}
