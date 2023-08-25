package org.codes.codingplatforms.gfg.Month8;

import org.codes.codingplatforms.gfg.Node;

public class HeightOfBST {

    int height(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        // code here

        return traverse(node);
    }
    private int  traverse(Node node)
    {
        int leftHeight=0;
        int rightHeight=0;
        if(node.left!=null)
        {
            leftHeight=traverse(node.left);

        }
        if(node.right!=null)
        {
            rightHeight=traverse(node.right);
        }
        return (leftHeight>rightHeight?leftHeight:rightHeight)+1;
    }
}
