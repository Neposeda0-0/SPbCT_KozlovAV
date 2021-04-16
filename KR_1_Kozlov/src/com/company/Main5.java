package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();

        if(a>-10 && a<10){
            a+=5;
        }else{
            a-=10;
        }

        System.out.println("Число после изменений: \n" + a);

    }
}
