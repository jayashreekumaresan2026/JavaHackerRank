package com.company;

import java.util.Scanner;

class SubString {
    void subString(String words, int startNumber, int endNumber) {
        String input=" ";
        char[] tempArray = words.toCharArray();
        for (int i = startNumber; i < endNumber; i++) {
            input +=tempArray[i];
        }
        System.out.println(input);
    }
}

public class JavaSubString {
    public static void main(String[] args) {
        SubString subString = new SubString();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String :");
        String word = scanner.nextLine();
        System.out.print("Enter the starting index :");
        int startNumber = scanner.nextInt();
        System.out.print("Enter the ending index :");
        int endNumber = scanner.nextInt();
        subString.subString(word, startNumber, endNumber);

    }
}
