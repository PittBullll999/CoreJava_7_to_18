package org.codes.codingplatforms.leet.april;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ShuffleArray {
    int reset[];
    int nums[];

    public ShuffleArray(int[] nums) {
        this.reset=nums;
        this.nums=nums;

    }

    public int[] reset() {
//        Collections.addAll(this.nums,reset);
        nums=Arrays.copyOf(reset,reset.length);
//        for(int i=0;i<nums.length;i++)
//        {
//            nums[i]=reset[i];
//
//        }
        return nums;
    }

    public int[] shuffle() {
        Random random=new Random();
        for(int i=0;i<nums.length;i++)
        {
            int p= random.nextInt(nums.length);
            int q=random.nextInt(nums.length);
            int t=nums[p];
            nums[p]=nums[q];
            nums[q]=t;

        }
        return nums;
    }
}
