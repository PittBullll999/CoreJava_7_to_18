package org.codes.codingplatforms.interviewbit.april;



public class CreateTree {
    public static TreeNode insertLevelOrder(int[] arr, int i)
    {
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length) {
            if(arr[i]==Integer.MIN_VALUE)
            {
                return root;
            }
            root = new TreeNode(arr[i]);

            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
    public static void printPreOrder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        else {
            System.out.println(node.val);
            if(node.left!=null)
            {
                printPreOrder(node.left);
            }
            if(node.right!=null)
            {
                printPreOrder(node.right);
            }
        }
    }
}
