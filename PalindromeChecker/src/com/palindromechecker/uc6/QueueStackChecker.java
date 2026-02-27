package com.palindromechecker.uc6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class QueueStackChecker {

    /**
     * Checks if the given string is a palindrome using a Queue and Stack together.
     *
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().trim();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push every character
        for (char c : normalized.toCharArray()) {
            queue.offer(c);
            stack.push(c);
        }

        // Compare Queue (FIFO = original) vs Stack (LIFO = reversed)
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Displays the queue+stack palindrome check result with step breakdown.
     *
     * @param input the original string
     */
    public static void printResult(String input) {
        String normalized = input.toLowerCase().trim();
        boolean result = isPalindrome(input);

        System.out.println("--------------------------------------------");
        System.out.println("UC6: Queue + Stack Based Palindrome Check");
        System.out.println("--------------------------------------------");
        System.out.println("Input         : \"" + input + "\"");
        System.out.println("Queue (FIFO)  : original order  -> " + normalized);
        System.out.println("Stack (LIFO)  : reversed order  -> " + new StringBuilder(normalized).reverse());
        System.out.println("Comparison    : character-by-character match");
        System.out.println("Result        : " + (result ? "IS a palindrome" : "NOT a palindrome"));
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UC6 - Enter a string: ");
        String input = scanner.nextLine();
        printResult(input);
        scanner.close();
    }
}
