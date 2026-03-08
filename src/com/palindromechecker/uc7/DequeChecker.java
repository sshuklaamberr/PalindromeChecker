package com.palindromechecker.uc7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class DequeChecker {

    /**
     * Checks if the given string is a palindrome using a Deque.
     * Optimized: only performs n/2 comparisons.
     *
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().trim();
        Deque<Character> deque = new ArrayDeque<>();

        // Add all characters to the deque
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and back simultaneously
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Displays the Deque-based palindrome check result with optimization notes.
     *
     * @param input the original string
     */
    public static void printResult(String input) {
        String normalized = input.toLowerCase().trim();
        boolean result = isPalindrome(input);
        int comparisons = normalized.length() / 2;

        System.out.println("--------------------------------------------");
        System.out.println("UC7: Deque-Based Optimized Palindrome Check");
        System.out.println("--------------------------------------------");
        System.out.println("Input          : \"" + input + "\"");
        System.out.println("String Length  : " + normalized.length() + " characters");
        System.out.println("Comparisons    : " + comparisons + "  (n/2 — optimized)");
        System.out.println("Method         : pollFirst() vs pollLast() on Deque");
        System.out.println("Result         : " + (result ? "IS a palindrome" : "NOT a palindrome"));
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UC7 - Enter a string: ");
        String input = scanner.nextLine();
        printResult(input);
        scanner.close();
    }
}
