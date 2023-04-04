package org.codes.codingplatforms.leet.april;

public class CousinsBST {
    int level_x=-1;
    int level_y=-1;
    TreeNode parentNodeX;
    TreeNode parentNodeY;
    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root,x,y,0,null);

        if(level_y==level_x&&(parentNodeY!=parentNodeX))
        {
            return true;
        }
        return false;


    }
    private void traverse(TreeNode node,int targetX,int targetY,int level,TreeNode parent)
    {
        if(node.val==targetX)
        {
            parentNodeX=parent;
            level_x=level;
        }
        if(node.val==targetY)
        {
            level_y=level;
            parentNodeY=parent;
        }
        if(node.left!=null)
        {
            traverse(node.left,targetX,targetY,level+1,node);
        }
        if(node.right!=null)
        {
            traverse(node.right,targetX,targetY,level+1,node);
        }

    }
}
