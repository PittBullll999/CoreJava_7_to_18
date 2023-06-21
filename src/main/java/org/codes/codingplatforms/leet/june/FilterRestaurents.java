package org.codes.codingplatforms.leet.june;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRestaurents {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer>l=Arrays.stream(restaurants).filter(i->{
            if(veganFriendly==1)
            {
                return i[2]==veganFriendly&&i[3]<=maxPrice&&i[4]<=maxDistance;
            }
            else {
                return i[3]<=maxPrice&&i[4]<=maxDistance;
            }

        }).sorted(Comparator.comparing(arr->arr[1])).map(i->i[0]).collect(Collectors.toList());
         Collections.reverse(l);
         return l;
    }
}
