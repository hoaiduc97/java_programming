package LAB_02_1;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight(kg): ");
        float weight = scanner.nextFloat();

        System.out.println("Input your height(m): ");
        float height = scanner.nextFloat();
        float BMI = weight / (height * height);
        double expected_weight = 24.9 * (height * height);
        if(BMI <= 18.5){
            System.out.println("Underweight");
            System.out.printf("You need increase %,.2f kg", (expected_weight-weight));
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
            System.out.println("Good!! You are fit");
        }else if(BMI <= 29.9){
            System.out.println("Overweight");
            System.out.printf("You need decrease %,.2f kg", (weight - expected_weight));
        }else{
            System.out.println("Obesity");
            System.out.printf("You need decrease %,.2f kg", (weight - expected_weight));
        }
    }


}
