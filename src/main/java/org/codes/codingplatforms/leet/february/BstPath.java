package org.codes.codingplatforms.leet.february;


import java.util.ArrayList;
import java.util.List;

public class BstPath {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(3);
        TreeNode node3=new TreeNode(4);
        TreeNode node4=new TreeNode(5);
//        root.right=node1;
//        root.left=node2;
//        node1.left=node3;
//        node2.left=node4;
        BstPath b=new BstPath();
        b.binaryTreePaths(root).stream().forEach(System.out::println);
    }
    List<String> list=new ArrayList<>();
    TreeNode head;
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> newlist=new ArrayList<>();
        findPath(root,"");
        list.stream().forEach(i->
        {
            i=i.trim();

            String[] str=i.split(" ");
            String s=String.join("->",str);
            newlist.add(s);

        });


        return newlist;





    }
    private void findPath(TreeNode node,String s)
    {
        s+=" "+String.valueOf(node.val);
        if(node.right==null&&node.left==null)
        {

            list.add(s);
            return;
        }
        if(node.right!=null)
        {
            findPath(node.right,s);
        }
        if(node.left!=null)
        {
            findPath(node.left,s);
        }
    }
}
