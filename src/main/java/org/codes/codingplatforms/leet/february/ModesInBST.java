package org.codes.codingplatforms.leet.february;




import java.util.Map;
import java.util.TreeMap;

public class ModesInBST {

    TreeMap<Integer,Integer> map=new TreeMap<>();
    public int[] findMode(TreeNode root) {

        int [] m;
        checkMode(root);
        int max=0;
        int i=0;
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                count=0;
            }
            if(entry.getValue()==max)
            {
                count+=1;
            }
        }
        m=new int[count];
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==max)
            {
                m[i]=entry.getKey();
                i+=1;
            }
        }

        return m;

    }
    private void checkMode(TreeNode root)
    {
        map.put(root.val, map.getOrDefault(root.val,0)+1);
        if(root.left!=null)
        {
            checkMode(root.left);
        }
        if(root.right!=null)
        {
            checkMode(root.right);
        }

    }
}
