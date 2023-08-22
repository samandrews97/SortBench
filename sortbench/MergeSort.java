package sortbench;

import java.util.Arrays;
import java.util.Date;

public class MergeSort {

    public static void mergeSort(String[] a) {

        System.out.println("I am sorting, this may take some time");

        // Start point for calculating time.
        Date past = new Date();

        // Perform the sort.
        merSort(a);

        // End point for calculating time.
        Date future = new Date();

        // Test to check that the array is sorted correctly.
        //System.out.println(Arrays.toString(a));

        // Print the time taken for the algorithm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }

    
    // Perform a merge sort on the array.
    public static void merSort(String[] a) {

        int aLength = a.length;

        // If length of subarray is less than 2, continue as it is sorted.
        if (aLength < 2) {

            return;

        }

        // Find array mid point and split into two sub-arrays.
        int midPoint = aLength / 2;
        String[] leftSubArray = new String[midPoint];
        String[] rightSubArray = new String[aLength - midPoint];

        // Populate the left sub-array.
        for (int i = 0; i < midPoint; i++) {

            leftSubArray[i] = a[i];

        }

        // Populate the right sub-array.
        for (int j = midPoint; j < aLength; j++) {

            rightSubArray[j - midPoint] = a[j];

        }

        // Recursively perform mergeSort on sub-arrays.
        merSort(leftSubArray);
        merSort(rightSubArray);

        // Use merge to combine to sorted array
        merge(a, leftSubArray, rightSubArray);

    }

    

    // Merge sorted sub-arrays.
    private static void merge(String[] a, String[] leftArray, String[] rightArray) {

        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        // Iterators to go through left array, right array and merged array, respectively.
        int i = 0, j = 0, k = 0;

        while (i < leftArraySize && j < rightArraySize) {

            if (leftArray[i].compareTo(rightArray[j]) < 0) {

                a[k] = leftArray[i];

                i++;

            } else {

                a[k] = rightArray[j];

                j++;

            }

            k++;

        }

        // Add any elements remaining in left or right array.
        while (i < leftArraySize) {

            a[k] = leftArray[i];

            i++;
            k++;

        }

        while (j < rightArraySize) {

            a[k] = rightArray[j];

            j++;
            k++;

        }

    }

    // Display info about the merge sort algorithm.
    public static void mergeInfo() {

        System.out.println();
        System.out.println("About:");
        System.out.println("The Merge sort algorithm is an efficient divide-and-conquer algorithm. It first starts by dividing an unsorted list in half "
                           + "repatedly until it has n sublists, each with one element. It then compares pairs of elements, sorts them, and merges them. It then repeats "
                           + "comparing merged sublits and sorts them repeatedly until it is left with a complete sorted list.");
        System.out.println();
        System.out.println("Performance:");
        System.out.println("Worst-case: O(nlogn) time complexity.");
        System.out.println("Average: O(nlogn) time complexity.");
        System.out.println("Best-case: O(nlogn) time complexity.");
        System.out.println("Memory: The worst-case space complexity is O(n) total with O(n) auxiliary, or O(1) auxiliary when using linked lists");
        System.out.println();
        System.out.println("Merge sort is efficient for large data sets and can be designed to be very parallel.");
        System.out.println();
        System.out.println("Trivia:");
        System.out.println("Merge sort is a divide-and-conquer algorithm invented by John von Neumann in 1945. In a report by Goldstine and von Neumann in 1948 a detailed description and an analysis of a bottom-up merge sort appeared.");
        System.out.println();
        System.out.println("Merge sort type algorithms were used in early computers to sort large data sets residing on disk or tape storage, where the data set was too large to fit into the smaller amount of memory that early computers had.");
        System.out.println();
        System.out.println("Some variatons of the Merge sort are:");
        System.out.println("Natural merge sort, Ping-pong merge sort, External merge sort, Tiled merge sort, as well as a lot of Parallel merge sorts.");
        System.out.println();
        
    }
    
}
