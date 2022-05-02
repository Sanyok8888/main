
public class ArraysRef {
    public static void main(String[] args) {
        int[] inputArray;
        int[] resultArray;
        int resultArraySize = 0;
        int resultArrayCounter = 0;
        ArrayRefClass ArrayRefClass = new ArrayRefClass();

        inputArray = ArrayRefClass.getArrayFromConsole();

        System.out.println("Input array includes: ");

        ArrayRefClass.printArray(inputArray);

        for (int i : inputArray){
            if (i > 0){
                resultArraySize++;
            }
        }
        resultArray = new int[resultArraySize];

        for (int i : inputArray){
            if (i > 0){
                resultArray[resultArrayCounter] = i;
                resultArrayCounter++;
            }
        }

        ArrayRefClass.printArray(resultArray);
    }
}
