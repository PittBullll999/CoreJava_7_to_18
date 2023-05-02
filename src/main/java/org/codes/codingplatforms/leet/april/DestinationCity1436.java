package org.codes.codingplatforms.leet.april;

import java.util.*;

public class DestinationCity1436 {
    public static void main(String[] args) {
        List<List<String>> list=List.of(List.of("London","New York"),List.of("New York","Lima"),List.of("Lima","Sao Paulo"));
        DestinationCity1436 d=new DestinationCity1436();
        d.destCity(list);
    }
    public String destCity(List<List<String>> paths) {
        Set<String>  source=new HashSet<>();
        Set<String> all=new HashSet<>();
        for(int i=0;i<paths.size();i++)
        {
            List<String> list=paths.get(i);
            String cityA=list.get(0);
            String cityB=list.get(1);
            source.add(cityA);
            all.add(cityA);
            all.add(cityB);
        }
        for(String s:source)
        {
            if(all.contains(s))
            {
                all.remove(s);
            }
        }
        for(String s:all)
        {
            return s;
        }
        return "";


    }
}
