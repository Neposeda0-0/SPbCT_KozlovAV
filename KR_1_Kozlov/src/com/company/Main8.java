package com.company;

public class Main8 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++)
        {
            int  j = i, s = 0;
            while (j != 0)
            {
                s +=  j % 10;
                j = j / 10;
            }
            if (s == 15)
                System.out.println(i);

        }
    }
}
