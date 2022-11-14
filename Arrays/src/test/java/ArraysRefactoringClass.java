
import java.util.Scanner;

public class ArraysRefactoringClass {

    void outLn(String value) {
        System.out.println(value);
    }

    static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int value: ");
        return scanner.nextInt();
    }


    //InputArray filling
    int[] fillInputArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = readInt();
        }
        return array;
    }
//a

    //ResultArray printing
    void printArray(int[] array) {
        for (int x : array) {
            outLn("[" + x + "]");
        }
        outLn(" ");
    }


}
