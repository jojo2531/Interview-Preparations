package com.jojo.company.comcast;

import java.util.stream.IntStream;

public class Fizz {

    public static void main(String[] args) {

       // int x = 10;

        Fizz fizz = new Fizz();

        IntStream.rangeClosed(1, 100).forEach( x -> System.out.println(fizz.retrieveFizzBuzz(x)));

    }

    public String retrieveFizzBuzz(int x)   {

        if(x % 3 == 0 && x % 5 == 0)
            return "FizzBuzz";
        else if(x % 5 == 0)
            return "Buzz";
        else if(x % 3 == 0)
            return "Fizz";
        else
            return String.valueOf(x);
    }
}
