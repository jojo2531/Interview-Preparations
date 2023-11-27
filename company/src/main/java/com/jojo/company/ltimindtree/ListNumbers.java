package com.jojo.company.ltimindtree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,12,22,13,19,21,31,22,222);

        List<Integer> result = list.stream()
                .filter(x -> String.valueOf(x).startsWith("2"))
                .distinct()
                .collect(Collectors.toList());

        for(int num: result)
            System.out.println(num);
    }


    /**
     *
     * class A -> color(String a, String b)
     * class A -> color(int a, int b)
     *
     *  color(long a, long b)
     *  color(float a, float b)
     *
     *
     * from main ->
     *
     * {
     *
     * }
     *
     *
     */
}
