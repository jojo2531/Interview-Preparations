package com.jojo.company.ltimindtree;

import java.util.List;
import java.util.Optional;

public class FindName {

    public static void main(String[] args) {

        List<String> nameList = List.of("Rao", "Kunal", "John", "Joseph");

        Optional<String> name = nameList.stream()
                .filter(x -> x.equalsIgnoreCase("Jojo"))
                .findAny();

        if(name.isPresent())
            System.out.println(name.get());

    }
}
