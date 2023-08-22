package sortbench;

import java.util.Date;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(String[] a) {

        System.out.println("I am sorting, this may take some time");

        // Starting point for calculating time.
        Date past = new Date();

        // Perform the sort on input array.
        selSort(a);

        // End point for calculating time.
        Date future = new Date();

        // Test to check that the array is sorted correctly.
        //System.out.println(Arrays.toString(a));

        // Print the time taken for the algorithm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }

    // Perform a selection sort on the array.
    public static void selSort (String[] a) {

        int arrayLength = a.length;


        for(int i = 0; i < arrayLength - 1; i++) {

            // Set the element with the minimum size and its index to the first element
            String min = a[i];
            int indexMin = i;


            for (int j = i + 1; j < arrayLength; j++) {

                // If the element at the current index is less than the current minimum, it becomes the new minimum.
                if (a[j].compareTo(min) < 0) {

                    min = a[j];
                    indexMin = j;

                }

            }

            // Swap the item at the current index with the minimum item found on this pass through the list.
            swap(a, i, indexMin);

        }

    }

    // Helper funtion to perform swaps on given elements in the list.
    private static void swap(String[] a, int x, int y) {

        String temp = a[x];

        a[x] = a[y];
        a[y] = temp;
    
    }
    
}
