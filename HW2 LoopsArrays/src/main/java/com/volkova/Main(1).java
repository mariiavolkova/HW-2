package main.java.com.volkova;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    static final int maxValueofRandom = 20;

    public static void main(String[] args) {
        int[] myArray = new int[20];

        createArray(myArray);
        getMinValue(myArray);
        getMaxValue(myArray);
        sortingArray(myArray);
        sortingArrayDescending(myArray);
        printSum(myArray);
        squareValues(myArray);
        printDiagonal();
    }

    private static void createArray(int[] myArray) {
        System.out.print("Generated Array: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * maxValueofRandom);
            System.out.print(myArray[i] + " ");
        }
    }

    private static void getMinValue(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++)
            min = Math.min(min, myArray[i]);
        System.out.println("\n" + "Minimal value of Array is : " + min);
    }

    private static void getMaxValue(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++)
            max = Math.max(max, myArray[i]);
        System.out.println("\n" + "Maximal value of Array is : " + max);
    }

    private static void sortingArray(int[] myArray) {
        System.out.print("Sorting Array looks like this: ");
        Arrays.sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    private static void sortingArrayDescending(int[] myArray) {
        System.out.print("\n" +"Sorting Array in Descending:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
            System.out.print(myArray[i] + " ");
        }
    }

    private static void printSum(int[] myArray) {
        int sum = 0;
        for (int value : myArray) {
            sum += value;
        }
        System.out.println("\n" + "Sum of all the numbers in my array: " + sum);
    }

    private static void squareValues(int[] myArray) {
        for (int j = 0; j < myArray.length; j++) {
            System.out.printf("\n" + "Value of " + j + " squared equals %.0f \n", Math.pow(j, 2));
        }
    }

    private static void printDiagonal() {
        System.out.print("\n" + "This is the value on the main diagonal : ");
        String[][] someMatrix =
                {{"cat", "dog", "cow"},
                        {"fish", "bird", "hamster"},
                        {"fly", "snake", "bear"}};
        for (int i = 0; i < someMatrix.length; i++) {
                System.out.print(someMatrix[i][i] + " ");
            }
    }
}
