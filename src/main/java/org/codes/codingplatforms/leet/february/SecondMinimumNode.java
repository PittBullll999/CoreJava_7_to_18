package org.codes.codingplatforms.leet.february;

public class SecondMinimumNode {
    class Solution {
        int first=2147483647;
        int second=2147483647;
        int f=0;
        public int findSecondMinimumValue(TreeNode root) {


            rec(root);
            if(second==2147483647&&f==0)
            {
                return -1;
            }
            return second;

        }
        private void rec(TreeNode root)
        {
            if(root.val<first)
            {
                first=root.val;
            }
            if(root.val<=second&&root.val>first)
            {
                f=1;
                second=root.val;
            }
            if(root.left!=null)
            {
                rec(root.left);
            }
            if(root.right!=null)
            {
                rec(root.right);
            }
        }
    }
}
