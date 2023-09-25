package LAB_03;

public class Lab_3_2 {
    public static void main(String[] args) {
        int[] intArr = {2, 1, 3, 4, 5, 6};
        int maxNum = intArr[0];
        int minNum = intArr[0];
        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] > maxNum) {
                maxNum = intArr[index];
            }
            if (intArr[index] < minNum) {
                minNum = intArr[index];
            }
        }
        System.out.printf("Min number %d\n", minNum);
        System.out.printf("Max number %d", maxNum);
    }
}
