import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class ArrayRefClass {

    Scanner scanner = new Scanner(System.in);

    int inputArraySize() {
        System.out.println("Enter inputArray size: ");
        return scanner.nextInt();
    }

    void outLn(String value) {
        System.out.print(value);
    }

    void out(String value) {
        System.out.println(value);
    }

    void out(int value) {
        System.out.print(value);
    }

    int readInt() {
        System.out.println("Enter int value: ");
        return scanner.nextInt();
    }

    void printArray(int[] array) {
        for (int i : array) {
            outLn("[" + i + "]");
        }
        out("");
    }

    int[] getArrayFromConsole() {
        int array[];
        outLn("Enter size");
        int size = readInt();
        array = new int[size];
        return fillArray(array);
    }

    int[] fillArray(int array[]){
        for (int i = 0; i<array.length; i++){
            array[i] =  readInt();
        }
        return array;
    }
    //a
}



