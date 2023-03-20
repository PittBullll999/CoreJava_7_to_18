package org.codes.codingplatforms.leet.march;

public class BSTCousins {
    Ob ob1=new Ob();
    Ob ob2=new Ob();

    public boolean isCousins(TreeNode root, int x, int y) {

        ob1.val=x;
        ob2.val=y;
        traverse(root,-1,0,x,y);
        if(ob1.depth== ob2.depth&&ob1.parent!= ob2.parent)
        {
            return true;
        }
        return false;


    }
    private void traverse(TreeNode node,int parent,int depth,int x,int y)
    {
        if(node.val==x)
        {
            ob1.depth=depth;
            ob1.parent=parent;
        }
        if(node.val==y)
        {
            ob2.depth=depth;
            ob2.parent=parent;
        }
        else {
            if(node.left!=null)
            {
                traverse(node.left,node.val,depth+1,x,y);
            }
            if(node.right!=null)
            {
                traverse(node.right,node.val,depth+1,x,y);
            }
        }

    }
}
class Ob{
    int val;
    int parent;
    int depth;
}
