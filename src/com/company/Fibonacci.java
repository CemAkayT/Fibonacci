package com.company;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        int firstTerm,secondTerm,thirdTerm;
        firstTerm = 0;
        secondTerm = 1;

        System.out.print("Enter number of terms of series: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number ; i++) {
            thirdTerm = firstTerm + secondTerm;
            System.out.println(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
