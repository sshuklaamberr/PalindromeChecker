package com.palindromechecker.uc1;

public class WelcomeMessage {
    public static void display() {
        System.out.println("============================================");
        System.out.println("        Welcome to PalindromeChecker        ");
        System.out.println("                 Version 1.0                ");
        System.out.println("============================================");
        System.out.println("  A console-based Java application that     ");
        System.out.println("  validates whether a given string is a     ");
        System.out.println("  palindrome under different conditions.    ");
        System.out.println("============================================");
        System.out.println();
    }

    // UC1 standalone entry point
    public static void main(String[] args) {
        display();
        System.out.println("Application started. Proceeding to next use case...");
    }
}
