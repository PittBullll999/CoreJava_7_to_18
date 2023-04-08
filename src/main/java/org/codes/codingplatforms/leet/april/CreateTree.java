package org.codes.codingplatforms.leet.april;

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
}
