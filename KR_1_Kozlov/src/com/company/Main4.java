package com.company;

public class Main4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Начальное значение переменной а = "+ a);
        System.out.println("Начальное значение переменной b = "+ b+"\n");

        int c = a;
        a = b;
        b = c;
        System.out.println("Значение переменной а = "+ a);
        System.out.println("Значение переменной b = "+ b);
    }
}
