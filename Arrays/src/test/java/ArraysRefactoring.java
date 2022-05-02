import java.util.Scanner;

public class ArraysRefactoring {

    public static void main(String[] args) {

        ArraysRefactoringClass arraysRefactoringClass = new ArraysRefactoringClass();
        ArraysRefactoringCounters arraysRefactoringCounters = new ArraysRefactoringCounters();
        //InputArray size
        int inputArraySize = arraysRefactoringCounters.typeInputArraySize();

        //InputArray inizialization
        int[] inputArray = new int[inputArraySize];

        //InputArray filling
        inputArray = arraysRefactoringClass.fillInputArray(inputArray);

        //ResultArray inizialization
        int[] resultArray = arraysRefactoringCounters.getResultArray(inputArray); //

        //ResultArray printing
        arraysRefactoringClass.printArray(resultArray);


    }
}




