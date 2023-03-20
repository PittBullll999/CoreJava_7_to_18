package org.codes.codingplatforms.leet.february;



public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        t1.right=t2;
        t1.left=t3;
        SumRootToLeafNumbers s=new SumRootToLeafNumbers();
        System.out.println(s.sumNumbers(t1));
    }
    int totalSum=0;
    public int sumNumbers(TreeNode root) {
        findSum(root,0);
        return totalSum;

    }
    private void findSum(TreeNode root,int sum)
    {
        int t=(sum*10)+root.val;
        if(root.left==null&&root.right==null)
        {
            totalSum+=t;
        }
        if(root.left!=null)
        {
            findSum(root.left,t);
        }
        if(root.right!=null)
        {
            findSum(root.right,t);
        }
    }
}
