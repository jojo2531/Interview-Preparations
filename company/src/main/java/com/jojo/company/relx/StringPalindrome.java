package com.jojo.company.relx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StringPalindrome {

    public static void main(String[] args) {

        String str = "awerey";

        List<String> stringList = getAllSubstring(str);
        Optional<String> palindrome = stringList.stream()
                .filter(StringPalindrome::isPalindrome)
                .findAny();

        if(palindrome.isPresent())
            System.out.println(palindrome.get());

    }

    public static boolean isPalindrome(String str) {

        int endIndex = str.length() - 1;
        for(int i = 0; i < str.length(); i++)   {
            if(str.charAt(i) != str.charAt(endIndex))
                return false;
            endIndex--;
        }

        return true;
    }

    static List<String> getAllSubstring(String str) {

        List<String> strList = new ArrayList<>();
        for(int i = 0; i < str.length() - 1; i++)   {
            int endIndex = i + 2;
            while(endIndex <= str.length())  {
                strList.add(str.substring(i, endIndex));
                endIndex++;
            }
        }

        return strList;
    }
}
