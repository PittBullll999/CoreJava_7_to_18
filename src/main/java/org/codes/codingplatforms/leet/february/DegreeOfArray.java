package org.codes.codingplatforms.leet.february;




import java.util.HashMap;




public class DegreeOfArray {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2,3,1,4,2};
        DegreeOfArray d=new DegreeOfArray();
        d.findShortestSubArray(nums);


    }
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int num=-1;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>max)
            {
                max=map.get(nums[i]);
                num=nums[i];

            }

        }
        int firstPos=0;
        int lastPos=0;
        boolean flag=true;
        int i=0;
        while(flag)
        {
            if(nums[i]==num)
            {
                firstPos=i;

                flag=false;
            }
            i+=1;
        }
        flag=true;
        i=nums.length-1;
        while (flag)
        {
            if(nums[i]==num)
            {
                lastPos=i;
                flag=false;
            }
            i-=1;
        }
        return lastPos-firstPos+1;

    }
}
