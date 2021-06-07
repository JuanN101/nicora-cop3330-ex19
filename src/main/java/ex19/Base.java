package ex19;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Juan Nicora
 */

import java.util.Scanner;

/*
Exercise 19 - BMI Calculator
You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.

Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:

bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.

Example Output
Your BMI is 19.5.
You are within the ideal weight range.
or

Your BMI is 32.5.
You are overweight. You should see your doctor.
Constraint
Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.
 */
public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your height? ");
        int height = in.nextInt();

        System.out.print("What is your weight? ");
        double weight = in.nextDouble();

        double bmi = (weight / (height * height)) * 703;

        if(18.5 <= bmi  && bmi <= 25) {
            System.out.println("You are within the ideal weight range.");
        }
        else {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
