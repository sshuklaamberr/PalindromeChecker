package com.palindromechecker.uc4;

import java.util.Scanner;

public class CharArrayChecker {

    /**
     * Checks if the given string is a palindrome using a character array.
     *
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        char[] chars = input.toLowerCase().trim().toCharArray();
        int left  = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Displays a character-by-character breakdown and the palindrome result.
     *
     * @param input the original string
     */
    public static void printResult(String input) {
        char[] chars = input.toLowerCase().trim().toCharArray();
        boolean result = isPalindrome(input);

        System.out.println("--------------------------------------------");
        System.out.println("UC4: Character Array Based Palindrome Check");
        System.out.println("--------------------------------------------");
        System.out.println("Input      : \"" + input + "\"");
        System.out.print  ("Char Array : [ ");
        for (char c : chars) {
            System.out.print("'" + c + "' ");
        }
        System.out.println("]");
        System.out.println("Result     : " + (result ? "IS a palindrome" : "NOT a palindrome"));
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UC4 - Enter a string: ");
        String input = scanner.nextLine();
        printResult(input);
        scanner.close();
    }
}
