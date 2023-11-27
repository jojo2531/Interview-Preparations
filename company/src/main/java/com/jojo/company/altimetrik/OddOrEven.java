package com.jojo.company.altimetrik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddOrEven {

    //List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        listOfIntegers
                .stream()
                .collect(Collectors.partitioningBy(value -> value % 2 == 0))
                .entrySet()
                .stream()
                .forEach(x -> {
                    System.out.println(x.getKey() + " ->" + x.getValue());
                });
    }
}
