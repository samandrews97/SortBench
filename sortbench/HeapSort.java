package sortbench;

import java.util.Date;

public class HeapSort {

    public static final String[] words = TxtFileToArray.populateArray();


    public static void heapSort(String[] a) {

        int arrayLength = words.length;

        System.out.println("I am sorting, this may take some time.");

        // Start point for calculating time.
        Date past = new Date();
        
        // Build the heap
        for (int i = (arrayLength / 2) - 1; i >= 0; i--) {

            heapify(words, arrayLength, i);

        }

        // Sort each element from back to front using the heap
        for (int i = arrayLength - 1; i > 0; i --) {

            // Move current root node to the end of the sorted array
            String temp = words[0];
            words[0] = words[i];
            words[i] = temp;

            // Heapify again to get next biggest node
            heapify(words, i, 0);

        }

        // End point for calculating time.
        Date future = new Date();

        // Display time taken to sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

        // Function for testing array is sorted.
        // for (int i = 0; i < arrayLength; i++) {

        //     System.out.println(words[i]);

        // }

    }
    

    // Convert the array into a max heap to be sorted.
    static void heapify(String[] a, int arrayLength, int i) {

        // The largest value is initialised as the root of the tree
        int largestValue = i;

        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // Check if the left child is larger than the root. If it is make it the largest.
        if ((leftChild < arrayLength) && (words[leftChild].compareTo(words[largestValue]) > 0)) {

            largestValue = leftChild;

        }

        // Check if the right child is larger than the root. If it is make it the largest.
        if ((rightChild <  arrayLength) && (words[rightChild].compareTo(words[largestValue]) > 0)) {

            largestValue = rightChild;

        }

        // If the largest element is not the root recursively heapify until it is.
        if (largestValue != i) {

            String temp = words[i];
            words[i] = words[largestValue];
            words[largestValue] = temp;

            heapify(words, arrayLength, largestValue);

        }

    }
    
}
