package LAB_02_2;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        if(number % 2 != 1){
            System.out.println("Even number!");
        }else{
            System.out.println("Odd number!");
        }
    }
}
