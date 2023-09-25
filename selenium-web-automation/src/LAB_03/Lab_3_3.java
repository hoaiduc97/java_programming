package LAB_03;

public class Lab_3_3 {
    public static void main(String[] args) {
        int[] intArray = {12, 34, 1, 16, 28};
        for (int index1 = 0; index1 < intArray.length; index1++) {
            for (int index2 = index1 + 1; index2 < intArray.length; index2++) {
                if (intArray[index2] < intArray[index1]) {
                    int temp;
                    temp = intArray[index1];
                    intArray[index1] = intArray[index2];
                    intArray[index2] = temp;
                }
            }
            System.out.println(intArray[index1]);
        }
    }
}
