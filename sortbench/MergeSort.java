package sortbench;

import java.util.Arrays;
import java.util.Date;

public class MergeSort {

    public static final String[] words = TxtFileToArray.populateArray();

    public static void mergeSort(String[] words) {

        System.out.println("I am sorting, this may take some time");

        // Start point for calculating time
        Date past = new Date();

        // Perform the sort
        sort(words);

        // End point for calculating time
        Date future = new Date();

        // Print the time taken for the algorithm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }

    

    public static void sort(String[] words) {

        int wordsLength = words.length;

        // If length of subarray is less than 2, continue as it is sorted.
        if (wordsLength < 2) {

            return;

        }

        // Find array mid point and split into two sub-arrays.
        int midPoint = wordsLength / 2;
        String[] leftSubArray = new String[midPoint];
        String[] rightSubArray = new String[wordsLength - midPoint];

        // Populate the left sub-array.
        for (int i = 0; i < midPoint; i++) {

            leftSubArray[i] = words[i];

        }

        // Populate the right sub-array.
        for (int j = midPoint; j < wordsLength; j++) {

            rightSubArray[j - midPoint] = words[j];

        }

        // Recursively perform mergeSort on sub-arrays.
        sort(leftSubArray);
        sort(rightSubArray);

        // Use merge to combine to sorted array
        merge(words, leftSubArray, rightSubArray);

    }

    

    // Merge sorted sub-arrays.
    private static void merge(String[] words, String[] leftArray, String[] rightArray) {

        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        // Iterators to go through left array, right array and merged array, respectively.
        int i = 0, j = 0, k = 0;

        while (i < leftArraySize && j < rightArraySize) {

            if (leftArray[i].compareTo(rightArray[j]) < 0) {

                words[k] = leftArray[i];

                i++;

            } else {

                words[k] = rightArray[j];

                j++;

            }

            k++;

        }

        // Add any elements remaining in left or right array.
        while (i < leftArraySize) {

            words[k] = leftArray[i];

            i++;
            k++;

        }

        while (j < rightArraySize) {

            words[k] = rightArray[j];

            j++;
            k++;

        }

    }
    
}
