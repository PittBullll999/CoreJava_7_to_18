package org.codes.codingplatforms.leet.march;

public class MaximumDepthOfNArryTree {
    int max=1;
    public int maxDepth(Node root) {
        int maxLevel=1;
        traverse(root,1);
        return maxLevel;


    }
    private void traverse(Node node,int level)
    {
        if(level>max)
        {
            max=level;
        }
        for(int i=0;i<node.children.size();i++)
        {
            traverse(node.children.get(i),level+1);
        }
    }
}
