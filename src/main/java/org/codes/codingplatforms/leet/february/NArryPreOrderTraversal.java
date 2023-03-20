package org.codes.codingplatforms.leet.february;


import java.util.ArrayList;
import java.util.List;

public class NArryPreOrderTraversal {
    //List<Integer> list=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        traverse(root,list);
        return list;

    }
    private void traverse(Node root,List<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        for(Node node:root.children)
        {
            traverse(node,list);
        }
        list.add(root.val);

    }
}
