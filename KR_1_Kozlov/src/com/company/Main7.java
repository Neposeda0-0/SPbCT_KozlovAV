package com.company;

public class Main7 {
    public static void main(String[] args) {
        for (float i = (float)1.2; i<=3; i+=0.2){
            String result = String.format("%.1f",i);
            System.out.println(result);
        }
    }
}
