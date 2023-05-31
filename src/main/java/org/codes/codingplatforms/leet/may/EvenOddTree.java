package org.codes.codingplatforms.leet.may;


import org.codes.codingplatforms.leet.april.CreateTree;
import org.codes.codingplatforms.leet.april.TreeNode;
import org.codes.codingplatforms.leet.march.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenOddTree {
    public static void main(String[] args) {
        TreeNode head= CreateTree.insertLevelOrder(new int[]{1,10,4,3,Integer.MIN_VALUE,7,9,12,8,6,Integer.MIN_VALUE,Integer.MIN_VALUE,2},0);
        EvenOddTree e=new EvenOddTree();
        e.isEvenOddTree(head);
    }
    Map<Integer, List<Integer>> map=new HashMap<>();
    public boolean isEvenOddTree(TreeNode root) {
        traFun(root,0);
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet())
        {
            System.out.println("level is "+entry.getKey()+"list is "+entry.getValue().toString());
            boolean t=validate(entry.getValue(),entry.getKey());
            if(!t)
            {
                return false;
            }
        }

        return true;
    }
    public void traFun(TreeNode node,int level)
    {
        if(map.containsKey(level))
        {
            List<Integer> list=map.get(level);
            list.add(node.val);
            map.put(level,list);
        }
        else {
            List<Integer> list=new ArrayList<>();
            list.add(node.val);
            map.put(level,list);
        }
        if(node.left!=null)
        {
            traFun(node.left,level+1);

        }
        if (node.right!=null)
        {
            traFun(node.right,level+1);
        }


    }
    public boolean validate(List<Integer> list,int level)
    {
        if(level%2==1)//odd->Decreasing
        {
            for(int i=1;i<list.size();i++)
            {
                int t=list.get(i);
                int t2=list.get(i-1);
                if(t%2!=0||t2%2==1||list.get(i)>list.get(i-1))
                {
                    return false;
                }
            }
            return true;
        }
        else{//even-increasing
            for(int i=1;i<list.size();i++)
            {
                int t=list.get(i);
                int t2=list.get(i-1);
                if(t%2!=1||t2%2==0||list.get(i)<list.get(i-1))
                {
                    return false;
                }
            }
            return true;
        }
    }

}
