package com.palindromechecker.uc3;

import java.util.Scanner;


public class StringReversalChecker {

    /**
     * Checks if the given input string is a palindrome using string reversal.
     *
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().trim();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    /**
     * Displays the result of the palindrome check.
     *
     * @param input the original string
     */
    public static void printResult(String input) {
        boolean result = isPalindrome(input);
        System.out.println("--------------------------------------------");
        System.out.println("UC3: Palindrome Check Using String Reversal");
        System.out.println("--------------------------------------------");
        System.out.println("Input    : \"" + input + "\"");
        System.out.println("Reversed : \"" + new StringBuilder(input.toLowerCase().trim()).reverse() + "\"");
        System.out.println("Result   : " + (result ? "IS a palindrome" : "NOT a palindrome"));
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UC3 - Enter a string: ");
        String input = scanner.nextLine();
        printResult(input);
        scanner.close();
    }
}
