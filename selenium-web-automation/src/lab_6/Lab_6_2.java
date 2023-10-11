package lab_6;

import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";

        boolean isPasswordRight = true;
        int tryTimes = 3;
        while (isPasswordRight){
            System.out.println("Input your password:");
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.next();
            if(myPassword.equals(inputPassword)){
                System.out.println("Password is correct!!!");
                isPasswordRight = false;
            }else{
                tryTimes--;
                System.out.println("Password is wrong!!! Please try again");
                System.out.printf("You remain %d times try\n", tryTimes);
                if(tryTimes == 0){
                    isPasswordRight = false;
                    System.out.println("You are out of times!!!");
                }
            }
        }
    }
}
