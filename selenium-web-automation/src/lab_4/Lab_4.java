package lab_4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        // Declare an array list
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Declare a random number smaller than 1000
        int randomNum = new SecureRandom().nextInt(1000);
        // Add elements to the array list
        for (int index = 0; index < 5; index++) {
            arrayList.add(randomNum); // Adding elements to the ArrayList
        }
        // Set value for elements in array
        for (int index = 0; index < 5; index++) {
            arrayList.set(index, new SecureRandom().nextInt(1000));
        }
        //

        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            int userOption = getUserOption();
            switch (userOption) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    System.out.println("All numbers in array:");
                    printAllNumbers(arrayList);
                    break;
                case 2:
                    findMaxNum(arrayList);
                    break;
                case 3:
                    findMinNum(arrayList);
                    break;
                case 4:
                    searchNum(arrayList);
                    break;
            }
        }
        System.out.println("Good bye!!!");
    }
    // Function to print the menu
    public static void printMenu() {
        System.out.println("Pick a option to begin!!!");
        System.out.println("0. Exit game:");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
    }
    // Function to get user option from keyboard input
    private static int getUserOption() {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    // Print all numbers
    private static void printAllNumbers(ArrayList<Integer> arrayList) {
        for (Integer number : arrayList) {
            System.out.println(number);
        }
    }
    // Find max number
    private static void findMaxNum(ArrayList<Integer> arr) {
        int maxNum = arr.get(0);
        for (Integer number : arr) {
            int currentValue = number;
            if (currentValue > maxNum) {
                maxNum = currentValue;
            }
        }
        System.out.printf("Maximum number:%d\n", maxNum);
    }
    // Find min number
    private static void findMinNum(ArrayList<Integer> arr) {
        int minNum = arr.get(0);
        for (Integer number : arr) {
            int currentValue = number;
            if (currentValue < minNum) {
                minNum = currentValue;
            }
        }
        System.out.printf("Minimum number:%d\n", minNum);
    }
    // Search number in array
    private static void searchNum(ArrayList arr){
        System.out.println("Guess a number in list:");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        boolean isFound = false; // Flag to track if the number is found
        for (int indexOfArray = 0; indexOfArray < arr.size(); indexOfArray++) {
            int currentValue = (int) arr.get(indexOfArray);
            if(currentValue == inputNum){
                System.out.printf("Bingo!!! You have correct the number: %d\n", inputNum);
                System.out.printf("The number located in position %d\n", indexOfArray);
                isFound = true;
                break;
            }
        }
        if(!isFound){
                System.out.println("Good luck @@");
        }
    }
}
