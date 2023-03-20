package org.codes.codingplatforms.leet.december2022;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
        public static void main(String[] args) {
                MyHashSet  myHashSet=new MyHashSet();
                myHashSet.add(1);
                myHashSet.add(2);
                System.out.println(myHashSet.contains(1));
                System.out.println(myHashSet.contains(3));
                myHashSet.add(2);
                System.out.println(myHashSet.contains(2));
                System.out.println(myHashSet.list);
                myHashSet.remove(2);
                System.out.println(myHashSet.contains(2));
        }

        List<Integer> list;
        public MyHashSet() {
                this.list=new ArrayList<>();

        }

        public void add(int key) {
                if(!list.contains(key))
                {
                        list.add(key);
                }

        }

        public void remove(int key) {
                for(int i=0;i< list.size();i++)
                {
                        if(list.get(i)==key)
                        {
                                list.remove(i);
                        }
                }



        }

        public boolean contains(int key) {
                return list.contains(key);

        }

}
