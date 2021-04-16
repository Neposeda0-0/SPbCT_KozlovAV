package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        final int N = 3;

        final Scanner scanner = new Scanner(System.in);
        final char c = scanner.useDelimiter("").next().toLowerCase().charAt(0);

        for (int i = 1; i <= N; i++) {
            System.out.println((char) ('a' + (c - 'a' + i) % 26));
        }
    }
}
