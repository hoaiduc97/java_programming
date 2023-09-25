package LAB_03;

public class Lab_3_4 {
    public static void main(String[] args) {
        int[] intArray1 = {1, 12, 16, 28, 34};
        int[] intArray2 = {1, 13, 16, 27, 99};
        int mergedArrayLength = intArray2.length + intArray1.length;
        int[] mergedArray = new int[mergedArrayLength];
        // Copy Array1 to mergedArray
        for (int index = 0; index < intArray1.length; index++) {
            mergedArray[index] = intArray1[index];
        }
        // Copy Array2 to mergedArray
        for (int index2 = 0; index2 < intArray2.length; index2++) {
            mergedArray[intArray1.length + index2] = intArray2[index2];
        }
        
        // Sort the merge array
        for (int index1 = 0; index1 < mergedArray.length; index1++) {
            for (int index2 = index1 + 1; index2 < mergedArray.length; index2++) {
                if (mergedArray[index2] < mergedArray[index1]) {
                    int temp;
                    temp = mergedArray[index1];
                    mergedArray[index1] = mergedArray[index2];
                    mergedArray[index2] = temp;
                }
            }
            // Print sorted merge array
            System.out.println(mergedArray[index1]);
        }
    }
}
