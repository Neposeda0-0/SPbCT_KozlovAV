package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4-х значное число:");
        int a = sc.nextInt();
        // 4958
        int char1 = a/1000; // 4
        int char2 = (a/100)%10; // 9
        int char3 = (a%100)/10; // 5
        int char4 = a%10; // 8

        System.out.println("Измененное число:");

        int max1 = Math.max(char1, char2);
        int max2 = Math.max(char3, char4);
        int general_max = Math.max(max1, max2);

        int min1 = Math.min(char1,char2);
        int min2 = Math.min(char3,char4);
        int general_min = Math.min(min1,min2);

        if(general_max == char1){
            if (general_min == char2) {
                System.out.println(char2+""+char1+""+char3+""+char4);
            }else if(general_min == char3){
                System.out.println(char3+""+char2+""+char1+""+char4);
            }else if(general_min == char4){
                System.out.println(char4+""+char2+""+char3+""+char1);
            }else {
                System.out.println("Ошибка!");
            }
        }
        if(general_max == char2){
            if (general_min == char1) {
                System.out.println(char2+""+char1+""+char3+""+char4);
            }else if(general_min == char3){
                System.out.println(char1+""+char3+""+char2+""+char4);
            }else if(general_min == char4){
                System.out.println(char1+""+char4+""+char3+""+char2);
            }else {
                System.out.println("Ошибка!");
            }
        }
        if(general_max == char3){
            if (general_min == char1) {
                System.out.println(char3+""+char2+""+char1+""+char4);
            }else if(general_min == char2){
                System.out.println(char1+""+char3+""+char2+""+char4);
            }else if(general_min == char4){
                System.out.println(char1+""+char2+""+char4+""+char3);
            }else {
                System.out.println("Ошибка!");
            }
        }
        if(general_max == char4){
            if (general_min == char1) {
                System.out.println(char4+""+char2+""+char3+""+char1);
            }else if(general_min == char2){
                System.out.println(char1+""+char4+""+char3+""+char2);
            }else if(general_min == char3){
                System.out.println(char1+""+char2+""+char4+""+char3);
            }else {
                System.out.println("Ошибка!");
            }
        }

    }
}
