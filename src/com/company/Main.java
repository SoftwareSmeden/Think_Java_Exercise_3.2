package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Think Java - Exercise 3.2

        Scanner userInput = new Scanner(System.in);

        double tempCelsius;
        double tempFahrenheit;

        //Programmet venter på et input fra bruger.
        System.out.println("Hvad er temperaturen i celsius: ");
        tempCelsius = userInput.nextInt();

        //Input bliver til et output.
        tempFahrenheit = tempCelsius * 9/5 + 32;
        System.out.println(tempCelsius + " C" + " = " + tempFahrenheit + " F");
    }
}
