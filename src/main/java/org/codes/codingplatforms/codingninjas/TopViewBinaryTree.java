package org.codes.codingplatforms.codingninjas;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TopViewBinaryTree {
    static SortedMap<Integer,Ob> treeMap=new TreeMap<>();
    public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
        topView(0,0,root);
        Ob o;
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (treeMap.size()!=0)
        {
            o=treeMap.remove(treeMap.firstKey());
            arrayList.add(o.dat);
        }
        return arrayList;
        // Write your code here.
    }
    private static void topView(int pos,int level,BinaryTreeNode node)
    {
        if(treeMap.containsKey(pos))
        {
            if(treeMap.get(pos).level>level)
            {
                treeMap.put(pos,new Ob(level, node.val));
            }
        }
        else {
            treeMap.put(pos,new Ob(level,node.val));
        }
        if(node.left!=null)
        {
            topView(pos-1,level+1,node.left);
        }
        if(node.right!=null)
        {
            topView(pos+1,level+1, node.right);
        }


    }
}
class Ob{
    public int dat;
    public int level;

    public Ob(int level, int val) {
        this.dat=val;
        this.level=level;
    }
}
class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
