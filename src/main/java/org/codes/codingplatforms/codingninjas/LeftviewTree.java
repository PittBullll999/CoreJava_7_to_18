package org.codes.codingplatforms.codingninjas;


import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class LeftviewTree{
        static SortedMap<Integer,Integer> map=new TreeMap<>();
        public static ArrayList<Integer> getLeftView(TreeNode<Integer> root)
        {
            ArrayList list=new ArrayList();
                addNode(0,root);
                while (!map.isEmpty())
                {
                    list.add(map.remove(map.firstKey()));
                }
                return list;
        }
        private static void addNode(int level,TreeNode<Integer> node)
        {
            if(!map.containsKey(level))
            {
                map.put(level,node.data);
            }
            if(node.left!=null)
            {
                addNode(level+1,node.left);

            }
            if(node.right!=null)
            {
                addNode(level+1,node.right);
            }
        }
}
class TreeNode<T>
{

    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data)
    {
        this.data = data;
        left = null;
        right = null;
    }
};
