package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время в минутах:");
        int a = scanner.nextInt();
        System.out.println("Введите расстояние в километрах:");
        int b = scanner.nextInt();

        a = a * 60;
        b = b * 1000;

        System.out.println("Скорость равна: "+ b/a + " м/с");
    }
}
