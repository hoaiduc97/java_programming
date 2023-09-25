package LAB_03;

public class Lab_3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int evenNum = 0;
        int oddNum = 0;
        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] % 2 != 1) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.printf("Even numbers %d\n", evenNum);
        System.out.printf("Odd numbers %d", oddNum);
    }
}
