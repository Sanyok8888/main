import java.util.Scanner;


public class ArraysRefactoringCounters {
    Scanner scanner = new Scanner(System.in);
    int readInt() {

        System.out.println("Enter int value: ");
        return scanner.nextInt();
    }

    int typeInputArraySize(){

        System.out.println("Enter inputArray size: ");
        return scanner.nextInt();
    }


    int countPositiveValue;

    int getCountPositiveValue(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                countPositiveValue++;
            }
        }
        return countPositiveValue;
    }


    int[] getResultArray(int[] array){
        resultArray = new int[getCountPositiveValue(array)];
        positiveCountReturn(array);
        return resultArray;
    }


    int[] resultArray;
    int positiveCount;

    void positiveCountReturn(int[] array) {
        positiveCount = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                resultArray[positiveCount] = array[j];
                positiveCount++;
            }
        }
    }
}
