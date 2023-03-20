package org.codes.codingplatforms.leet.february;


import java.util.ArrayList;
import java.util.List;

public class BST_RightSideView {
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
           traveerseTree(root);
           return list;
    }
    private void traveerseTree(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        list.add(node.val);
        if(node.right==null)
        {
            traveerseTree(node.left);
        }
        else {
            traveerseTree(node.right);
        }
    }
}
