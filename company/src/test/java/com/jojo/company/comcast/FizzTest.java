package com.jojo.company.comcast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzTest {

    @Test
    public void testForNumberDivisibleBy5And3(){

        Fizz fizz = new Fizz();
        assertEquals("FizzBuzz", fizz.retrieveFizzBuzz(15));
        assertEquals("FizzBuzz", fizz.retrieveFizzBuzz(30));
    }

    @Test
    public void testForNumberDivisible3(){

        Fizz fizz = new Fizz();
        assertEquals("Fizz", fizz.retrieveFizzBuzz(9));
        assertEquals("Fizz", fizz.retrieveFizzBuzz(21));
    }

    @Test
    public void testForNumberDivisibleBy5(){
        Fizz fizz = new Fizz();
        assertEquals("Buzz", fizz.retrieveFizzBuzz(10));
        assertEquals("Buzz", fizz.retrieveFizzBuzz(40));
    }

    @Test
    public void testForNonDivisibleNumber(){
        Fizz fizz = new Fizz();
        assertEquals("17", fizz.retrieveFizzBuzz(17));
        assertEquals("23", fizz.retrieveFizzBuzz(23));
    }
}