package org.codes.codingplatforms.leet.march;


import java.util.ArrayList;
import java.util.List;

public class LeafSimiliarTree {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafNodes1=new ArrayList<>();
        List<Integer> leafNodes2=new ArrayList<>();
        traverse(root1,leafNodes1);
        traverse(root2,leafNodes2);
        return leafNodes1.equals(leafNodes2);


    }
    public void  traverse(TreeNode node,List<Integer> leafNodes)
    {
        if(node.left==null&&node.right==null)
        {
            leafNodes.add(node.val);
            return;
        }
        if(node.left !=null)
        {
            traverse(node.left,leafNodes);
        }
        if (node.right!=null)
        {
            traverse(node.right,leafNodes);
        }

    }
}
