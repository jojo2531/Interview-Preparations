package com.jojo.company.altimetrik;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {

    // arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
    // output:  {8, 8, 8, 2, 2, 5, 5, 6}

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        // Element -> key, frequency -> value

        Map<Integer, Long> freqMap = Arrays
                .stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        freqMap.entrySet()
                .stream()
                .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                        .forEach(map -> {
                            long counter = map.getValue();
                            for(long i = 0; i < counter; i++)
                                System.out.print(map.getKey() + " ");
                        });


    }
}
