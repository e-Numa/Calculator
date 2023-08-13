package com.Enuma;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        //weight/height*height * 10000;
        System.out.println("Welcome to BMI CALCULATOR");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Weight: ");
        double weight = sc.nextDouble();

        System.out.println("Enter Height: ");
        double height = sc.nextDouble();

        double bodyWeight= (weight/ (height * height)) * 10000;
        System.out.println("Your BMI is: " + bodyWeight);


        if (bodyWeight <18.5){
            System.out.println("You are Under_Weight");
        } else if (bodyWeight >18.5 && bodyWeight <25.0) {
            System.out.println("You are Normal");
        } else if (bodyWeight >25.0 && bodyWeight <=100){
            System.out.println("You are Over_Weight");
        } else {
            System.out.println("ERROR");
        }

    /* ASSIGNMENT_QUESTION
    int BMI = Body Mass Index;
            BMI Calculator(CLI):
            Implement a BMI calculator that takes input from a user and returns the BMI result.
            NB: BMI => Body Mass Index
            Formula => (weight /  height * height) * 10000
            A BMI of 25.0 or more is OVER_WEIGHT, while the healthy range is 18.5 to 24.9 NORMAL_WEIGHT
            and a BMI of less than 18.5 is UNDER_WEIGHT.
            If (bodyWeight <18.5
            String bodyWeight = "Enter body weight:";
            A BMI of 25.0 or more is OVER_WEIGHT;
            A BMI of 18.5 to 24.9 is NORMAL_WEIGHT;
            A BMI of less than 18.5 is UNDER_WEIGHT;*/

    }
}
