//https://www.hackerrank.com/challenges/compare-the-triplets/problem?h_r=internal-search
package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CompareTriplet {
    int[] compareTriplet(List<Integer> alicaList, List<Integer> bobList) {
        int alica = 0, bob = 0;
        for (int i = 0; i < alicaList.size(); i++) {
            if (alicaList.get(i) > bobList.get(i)) {
                alica++;
            }
            if (alicaList.get(i) < bobList.get(i)) {
                bob++;
            }
        }
        return new int[]{alica, bob};
    }
}

class Main {
    public static void main(String[] args) {
        Main main=new Main();
        CompareTriplet compareTriplet = new CompareTriplet();
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = main.getFirstIntegers(scanner);
        List<Integer> secondList = main.getSecondIntegers(scanner);
        int[] result = compareTriplet.compareTriplet(firstList, secondList);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

     List<Integer> getSecondIntegers(Scanner scanner) {
        List<Integer> secondList = new ArrayList<>();
        System.out.print("Enter the second array elements :");
        String[] bobNumber = scanner.nextLine().split(" ");
        for (String s : bobNumber) {
            int secondArray = Integer.parseInt(s);
            secondList.add(secondArray);
        }
        return secondList;
    }

    List<Integer> getFirstIntegers(Scanner scanner) {
        List<Integer> firstList = new ArrayList<>();
        System.out.print("Enter the first array elements :");
        String[] alicaNumber = scanner.nextLine().split(" ");
        for (int i = 0; i < alicaNumber.length; i++) {
            String s = alicaNumber[i];
            int firstArray = Integer.parseInt(s);
            firstList.add(firstArray);
        }
        return firstList;
    }
}