package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM");
        Calendar calendar = new GregorianCalendar();
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormat1.format(calendar.getTime()));
        System.out.println("Козлов");
        System.out.println("Артем");
    }
}
