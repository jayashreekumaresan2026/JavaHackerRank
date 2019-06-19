package com.company;

import java.util.Arrays;
import java.util.Scanner;

class CheckAnagram {
    void checkAnagram(String word1, String word2) {
        char tempArray[] = word1.toCharArray();
        char tempArray1[] = word2.toCharArray();
        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);
        String string1 = new String(tempArray);
        String string2 = new String(tempArray1);
        checkWord(string1, string2);
    }

    void checkWord(String string1, String string2) {
        boolean retval2 = string1.equalsIgnoreCase(string2);
        if (retval2) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}

public class Anagram {
    public static void main(String[] args) {
        CheckAnagram checkAnagram = new CheckAnagram();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first String :");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second String :");
        String word2 = scanner.nextLine();
        checkAnagram.checkAnagram(word1, word2);
    }


}
