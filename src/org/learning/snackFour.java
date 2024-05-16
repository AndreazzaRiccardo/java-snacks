package org.learning;

import java.util.Scanner;

public class snackFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert word: ");
        String myString = scanner.nextLine().toLowerCase();

        for (int i = 0; i < myString.length() / 2; i++) {
            if(myString.charAt(i) != myString.charAt(myString.length() - 1 - i)) {
                System.out.println("The word is not palindrome");
                return;
            }
        }
        System.out.println("The word is palindrome");

        scanner.close();
    }
}
