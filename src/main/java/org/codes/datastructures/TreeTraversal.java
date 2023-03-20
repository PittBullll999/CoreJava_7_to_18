package org.codes.datastructures;




import java.util.*;

public class TreeTraversal {
    public static void main(String[] args) {
        Tr tree=new Tr();
        Node node=new Node(10);


        int t[]=new int[]{54,6,343,7,8,9,22,67,23,78};
        List<Integer> list=Arrays.asList(43,65,73,23,67,87,54,33,22);
        TreeSet<Integer> ts=new TreeSet<>(list);

        for(int i:t)
        {
            tree.insert(node,i);

        }
        tree.traverseInOrder(node);
        //TreeTraversal treeTraversal=new TreeTraversal();
        System.out.println();
        //System.out.println(checkdepthrec(node,68));
        System.out.println(checkBreadthQueue(node,67));
        //treeTraversal.breadthFirstTraversal(node).stream().forEach(System.out::println);
    }
    public List<Integer> depthFirstTraversl(Node node)
    {
        List<Integer> list=new ArrayList<>();
        if(node==null)
        {
            return null;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(node);
        while(!stack.empty())
        {
            Node node1=stack.pop();
            list.add(node1.value);
            if(node1.right!=null)
                stack.push(node1.right);
            if(node1.left!=null)
                stack.push(node1.left);

        }
        return list;
    }
    public List<Integer> depthFirstTraversalrecursive(Node node)
    {
        if(node==null)
        {
            return new ArrayList<>();
        }

        List<Integer> r=depthFirstTraversalrecursive(node.left);
        List<Integer> l=depthFirstTraversalrecursive(node.right);
        List<Integer> list=new ArrayList<>();
        list.add(node.value);

        list.addAll(r);
        list.addAll(l);
        return list;


    }
    public List<Integer> breadthFirstTraversal(Node node)
    {
        Queue<Node> queue=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        if(node==null)
        {
            return list;
        }
        queue.add(node);
        while(queue.size()>0)
        {
            Node node1=queue.remove();
            list.add(node1.value);
            if(node1.right!=null)
            {
                queue.add(node1.right);
            }
            if(node1.left!=null)
            {
                queue.add(node1.left);
            }

        }
        return list;

    }
    public static boolean checkdepthrec(Node node,int n)
    {
        if(node==null)
        {
            return false;
        }
        if (node.value==n)
        {
            return true;
        }
        return (checkdepthrec(node.left,n)||checkdepthrec(node.right,n));
    }
    public static boolean checkBreadthQueue(Node node, int n)
    {
        if(node==null)
        {
            return false;
        }
        Queue<Node> queue= new ArrayDeque<>();
        queue.add(node);
        while(queue.size()>0)
        {
            Node node1=queue.remove();
            if(node1.value==n)
            {
                return true;
            }
            if(node1.left!=null)
            {
                queue.add(node1.left);
            }
            if(node1.right!=null){

                queue.add(node1.right);
            }
        }
        return false;
    }

}
