package org.codes.codingplatforms.leet.april;

import java.util.*;

public class TopKFrequentWord {
    public static void main(String[] args) {
        String s[]=new String[]{"i","love","leetcode","i","love","coding"};
        TopKFrequentWord t=new TopKFrequentWord();
        t.topKFrequent(s,2).stream().forEach(System.out::println);

    }
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Char> pq=new PriorityQueue<>((x,y)->{
            if(y.val-x.val>1)
            {
                return y.val-x.val;
            }
            else if(y.val-x.val<1)
            {
                return x.val-y.val;
            }
            else {
                return y.string.compareTo(x.string);
            }
        });
        return new ArrayList<>();
    }
    class Char{
        public Char()
        {

        }
        String string;
        int val;
    }
}
