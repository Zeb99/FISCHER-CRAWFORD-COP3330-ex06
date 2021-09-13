package org.example;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat
/**
 * Retirment Calculator
 * UCF cop3330 Fall 2021 Assignment 6 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Date date = new Date();
        Scanner scan = new Scanner(System.in);

        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(date);
        int intYear = Integer.parseInt(currentYear);

        System.out.println("What is your current age? ");
        int age = scan.nextInt();
        System.out.println("At what age would you like to retire? ");
        int retirment_age = scan.nextInt();

        int yearOfRetirment = (retirment_age - age) + intYear;

        System.out.println("It's " + intYear + "so you can retire in " + yearOfRetirment);

    }
}
