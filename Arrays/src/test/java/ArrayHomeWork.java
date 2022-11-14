import java.util.Scanner;

public class ArrayHomeWork {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter inputArray size:");
        int inputArraySize = scanner.nextInt();
        int[] inputArray = new int[inputArraySize];
        int countPositiveValue = 0;


        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Enterr inputArray value:");
            inputArray[i] = scanner.nextInt();
            if (inputArray[i] > 0) {
                countPositiveValue++;
            }
        }

        int[] resultArray = new int[countPositiveValue];
        int positiveCount = 0;

        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] > 0) {
                resultArray[positiveCount] = inputArray[j];
                positiveCount++;
            }
        }

        for (int a : resultArray ){
            System.out.println("[" + a + "]");
        }
//aaf
    }
}




