package com.jojo.company.ascendion;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FindDuplicatesInString {

    public static void main(String[] args) {

        String tester = "This is a test for Ascendion";

       /* Map<Character, Long> count = */tester.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, HashMap::new, Collectors.counting()))
                .entrySet().stream()
                .forEach(x -> {
                    System.out.println(x.getKey() + " -> " + x.getValue());
                });


    }
}
