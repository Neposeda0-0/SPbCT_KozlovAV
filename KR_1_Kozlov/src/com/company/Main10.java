package com.company;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        for (char symbol : number.toCharArray()) {
            if (symbol != ' ') {
                symbol = (char) (symbol - 3);
            }
            System.out.print(symbol);
        }
    }
}
