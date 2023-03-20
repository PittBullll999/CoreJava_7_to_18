package org.codes.java.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakaWHile {


    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        List<Integer> integers=stream.takeWhile((n)->(n/4==1)).collect(Collectors.toList());//this take while will apply a predicate for each element and return a stream
        Stream<String> streamString
                = Stream.of( "aman", "amar","suraj","abhinav","athul",
                "suvam", "Zahafuj");
        streamString.takeWhile((name)->(name.contains("a"))).forEach(System.out::println);
    }
}
