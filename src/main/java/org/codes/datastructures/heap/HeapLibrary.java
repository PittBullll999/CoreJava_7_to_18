package org.codes.datastructures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapLibrary {
    public static void main(String[] args) {
     HeapLibrary h=new HeapLibrary();
     h.heapCreation(new int[]{5,2,5,6,72,33,53});
    }
    private void heapCreation(int t[])
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int i:t)
        {
            heap.add(i);

        }
        System.out.println(heap);

    }
}
