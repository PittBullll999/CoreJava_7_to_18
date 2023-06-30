package org.codes.codingplatforms.leet.june;

import org.codes.codingplatforms.leet.april.CreateTree;
import org.codes.codingplatforms.leet.april.TreeNode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KthLargestLevelInBST {
    public static void main(String[] args) {
        TreeNode head=CreateTree.insertLevelOrder(new int[]{5,8,9,2,1,3,7,4,6},0);
        KthLargestLevelInBST k=new KthLargestLevelInBST();
        k.kthLargestLevelSum(head,2);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        HashMap<Integer,Integer>  map=new HashMap<>();
        recur(root,0,map);
        if(map.size()<k)
        {
            return -1;
        }
        for(int i=0;i<map.size();i++)
        {
            pq.offer(map.get(i));
        }
        int t=-1;
        for(int i=0;i<k;i++)
        {

            if(i==k-1)
            {
                return pq.poll();
            }
            pq.poll();
        }
        return t;

    }
    private void recur(TreeNode node, int level, HashMap<Integer,Integer> map)
    {
        map.put(level,map.getOrDefault(level,0)+node.val);
        if(node.left!=null)
        {
            recur(node.left,level+1,map);
        }
        if(node.right!=null)
        {
            recur(node.right,level+1,map);
        }
    }
}
