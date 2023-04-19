package org.codes.webflux.advancedflux;

import reactor.core.publisher.Flux;
import reactor.util.retry.Retry;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class newFLux {
    public static void main(String[] args) {
//        Flux<Integer> flux = Flux.range(1, 5)
//                .map(i -> {
//                    if (i == 3) {
//                        throw new RuntimeException("Error");
//                    }
//                    return i;
//                });
//
//        flux.retryWhen(Retry.backoff(3, Duration.ofSeconds(2))).subscribe(
//                value -> System.out.println("Received: " + value),
//                error -> System.err.println("Error: " + error)
//        );
        List<List<List<Integer>>> list=new ArrayList<>();
        List<Integer> newlist=List.of(1,2,3,4,7,4,3);
        List<Integer> newlist1=List.of(1,2,3,4,58,58,74,36);
        List<Integer> newlist2=List.of(89,5,9,22,75);
        List<Integer> newlist3=List.of(1,83,47,62,14,78);
        List<List<Integer>> nesList1=List.of(newlist1,newlist2);
        List<List<Integer>> nesList2=List.of(newlist2,newlist3);
        List<List<Integer>> nesList3=List.of(newlist3,newlist);
        list.add(nesList1);
        list.add(nesList2);
        list.add(nesList2);
        List<Integer>coll=list.stream().flatMap(i->{
            return i.stream().flatMap(j->{
                return j.stream();
            });
        }).collect(Collectors.toList());
        System.out.println(coll);


    }
}
