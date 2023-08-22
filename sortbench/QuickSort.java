package sortbench;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class QuickSort {

    public static void quickSort(String[] a) {

        System.out.println("I am sorting, this may take some time");

        // Starting point for calculating time
        Date past = new Date();

        // Perform a quick sorty on the array
        quickSort(a, 0, a.length - 1);

        // End point for calculating time
        Date future = new Date();   

        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

        // Test to check that the array is sorted correctly.
        //System.out.println(Arrays.toString(a));

    }

    // Perform a quick sort on the array.
    public static void quickSort(String[] a, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {

            return;

        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        String pivotPoint = a[pivotIndex];
        swap(a, pivotIndex, highIndex);

        int leftPointer = partition(a, lowIndex, highIndex, pivotPoint);

        quickSort(a, lowIndex, leftPointer - 1);
        quickSort(a, leftPointer + 1, highIndex);


    }

    private static int partition(String[] a, int lowIndex, int highIndex, String pivotPoint) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;


        while (leftPointer < rightPointer) {

            while (a[leftPointer].compareTo(pivotPoint) <= 0 && leftPointer < rightPointer) {

                leftPointer++;

            }

            while (a[rightPointer].compareTo(pivotPoint) >= 0 && leftPointer < rightPointer) {

                rightPointer--;

            }

            swap(a, leftPointer, rightPointer);

        }

        swap(a, leftPointer, highIndex);

        return leftPointer;

    }

    private static void swap(String[] a, int index1, int index2) {

        String temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

    }
}
