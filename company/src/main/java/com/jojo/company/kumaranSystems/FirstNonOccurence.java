package com.jojo.company.kumaranSystems;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonOccurence {

    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str.chars()
                .mapToObj((ch -> (char) ch))
                .collect(Collectors.groupingBy(letter -> letter, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() == 1)
                .findFirst().get().getKey());
    }
}
