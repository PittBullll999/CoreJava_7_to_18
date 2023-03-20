package org.codes.codingplatforms.leet.february;


import java.util.ArrayList;
import java.util.List;

public class NAryPreOrderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        traverse(root);
        return list;

    }
    private void traverse(Node root)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        for(Node node:root.children)
        {
            traverse(root);
        }
    }
}
