//https://www.hackerrank.com/challenges/solve-me-first/problem

package com.company;
import java.util.Scanner;


class SumValues {

        static int solveMeFirst(int a, int b) {
            int result =a+b;
            return result;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a;
            a = in.nextInt();
            int b;
            b = in.nextInt();
            int sum;
            sum = solveMeFirst(a, b);
            System.out.println(sum);
        }
    }


