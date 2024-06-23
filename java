// Java code to solve the problem 

import java.io.*; 
class GFG 
{ 
    // Java program to illustrate 
    // how to calculate BMI 
    public static double BMI(double height, double weight) 
    { 
        double bmi = weight / Math.pow(height, 2); 
        return bmi; 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
        double height = 1.79832; 
        double weight = 70; 
        // Function call 
        double bmi = BMI(height, weight); 
        System.out.print("The BMI is " + bmi + " so "); 
        // Conditions to find out BMI category 
        if (bmi < 18.5) 
            System.out.print("underweight");
        else if (bmi >= 18.5 && bmi < 24.9) 
            System.out.print("Healthy"); 
        else if (bmi >= 24.9 && bmi < 30) 
            System.out.print("overweight"); 
        else if (bmi >= 30) 
            System.out.print("Suffering from Obesity"); 
    } 
}
