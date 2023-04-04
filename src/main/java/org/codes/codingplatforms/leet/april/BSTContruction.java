package org.codes.codingplatforms.leet.april;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BSTContruction {
    public static void main(String[] args) {
        int t[][]=new int[][]{{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        BSTContruction b=new BSTContruction();
        b.createBinaryTree(t);
    }
    //[[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map=new HashMap<>();
        int i=0;
        TreeNode head = null;
        while(i<descriptions.length)
        {
            TreeNode node1;
            TreeNode node2;
            if(!map.containsKey(descriptions[i][0]))
            {
                node1=new TreeNode(descriptions[i][0]);
                map.put(node1.val,node1);

                if(map.containsKey(descriptions[i][1]))
                {
                    node2=map.get(descriptions[i][1]);
                    if(descriptions[i][2]==1)
                    {
                        node1.left=node2;
                    }
                    if(descriptions[i][2]==0)
                    {
                        node1.right=node2;
                    }
                }
                else {
                    node2=new TreeNode(descriptions[i][1]);
                    map.put(node2.val,node2);

                    if(descriptions[i][2]==1)
                    {
                        node1.left=node2;
                    }
                    if(descriptions[i][2]==0)
                    {
                        node1.right=node2;
                    }
                }
                if(node1.left==head||node1.right==head)
                {
                    head=node1;
                }
            }
            else {
                node1=map.get(descriptions[i][0]);
                if(map.containsKey(descriptions[i][1]))
                {
                    node2=map.get(descriptions[i][1]);
                    if(descriptions[i][2]==1)
                    {
                        node1.left=node2;
                    }
                    if(descriptions[i][2]==0)
                    {
                        node1.right=node2;
                    }
                }
                else {
                    node2=new TreeNode(descriptions[i][1]);
                    map.put(node2.val,node2);

                    if(descriptions[i][2]==1)
                    {
                        node1.left=node2;
                    }
                    if(descriptions[i][2]==0)
                    {
                        node1.right=node2;
                    }
                }
                if(node1.left==head||node1.right==head)
                {
                    head=node1;
                }
            }
            i++;
        }
        return head;

    }
}
