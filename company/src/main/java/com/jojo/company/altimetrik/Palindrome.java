package com.jojo.company.altimetrik;

public class Palindrome {

    public static void main(String[] args) {

        String test = "madqam";

        System.out.println(isPalindrome(test));
    }

    static boolean isPalindrome(String str)    {

        /**
         * No loops, no iterators
         * no methods that includes loops
         */

        return checkPalindrome(str, 0, str.length() - 1);
    }

    static boolean checkPalindrome(String str, int startIndex, int endIndex)  {

        // M A D A M

        if(startIndex >= endIndex)
            return true;

        if(str.charAt(startIndex) == str.charAt(endIndex) )
            return checkPalindrome(str, startIndex + 1, endIndex - 1);
        else
            return false;
    }

}
