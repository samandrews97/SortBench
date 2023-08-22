package sortbench;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class QuickSort {

    public static void quickSort(String[] a) {

        System.out.println("I am sorting, this may take some time");

        // Starting point for calculating time.
        Date past = new Date();

        // Perform a quick sorty on the array.
        quickSort(a, 0, a.length - 1);

        // End point for calculating time.
        Date future = new Date();  

        // Test to check that the array is sorted correctly.
        //System.out.println(Arrays.toString(a));

        // Print the time taken for the algorithm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }

    // Perform a quick sort on the array.
    public static void quickSort(String[] a, int lowIndex, int highIndex) {

        // If our partitions are a single item break out of the recursive calling.
        if (lowIndex >= highIndex) {

            return;

        }

        // Use a random pivot point in the list.
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        String pivotPoint = a[pivotIndex];
        // Put it at the end of the list.
        swap(a, pivotIndex, highIndex);

        int leftPointer = partition(a, lowIndex, highIndex, pivotPoint);

        // Recursively call quicksort on partitions.
        quickSort(a, lowIndex, leftPointer - 1);
        quickSort(a, leftPointer + 1, highIndex);


    }

    // Function to create partitions around the pivot point.
    private static int partition(String[] a, int lowIndex, int highIndex, String pivotPoint) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // While our left pointer (starts at the beginning of the list) and our right pointer (starts at the end of the list)
        // are not pointing to the same index and the item at their index is before or after the pivot item respecitvely, 
        // increment and decrement them. Doing swaps where appropriate.
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

    // Helper function to swap elements at given indexes.
    private static void swap(String[] a, int index1, int index2) {

        String temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

    }
}
