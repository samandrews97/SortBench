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

    public static void heapInfo() {

        System.out.println();
        System.out.println("About:");
        System.out.println("Heapsort is a comparison sorting algorithm that comprises of multiple parts." 
        + " The first part consists of creating a heap from the provided data. This heap has the layout of a "
        + "bianry tree, with each node in the tree mapping to an array indice. In the second part the array is sorted "
        + "by repeatedly removing the largest element, which is the root of the heap, and placing it at the end of the array "
        + "and updating the heap. This repeats until the heap is empty and the result is a sorted array.");
        System.out.println();
        System.out.println("Performance:");
        System.out.println("Worst-case: O(n log n) time complexity");
        System.out.println("Average: O(n log n) time complexity");
        System.out.println("Best-case: O(n log n) time complexity");
        System.out.println("Memory: The wrost-case space complexity is O(n) total and O(1) auxiliary");
        System.out.println();
        System.out.println("While faster than other algorithms such as bubblesort, heapsort competes mainly with quicksort."
                          + " While it has multiple benefits such as, simple non-recursive code, low memory requirements and doesn't " 
                          + "hit the worst case performance of quicksort - (n\u00b2). It has bad locality of reference, is not easy to alter " 
                          + "to make use of parallelism and is usually up to 3 times slower than quicksort. As such quicksort is preferred in "
                          + "programs where the time to implement and the extra perfromance are needed.");  
        System.out.println();
        System.out.println("Trivia:");
        System.out.println("The heapsort algorithm was invented by J. W. J. Williams in 1964. It was also the birth of the heap data structure.");
        System.out.println();
        System.out.println("Robert W. Floyd imporpved upon the original algorithm and his implementation allowed for in-place sorting");
        System.out.println("There are many variations of the heapsort algorithm. Some of these are:");
        System.out.println("Floyd's heap construction, Bottom-up heapsort, Ternary heapsort, Memory optimised heapsort, "
                          + "Out-of-place heapsort, Smoothsort, Weak heapsort and Katajainen's ultimate heapsort");
        System.out.println();
        System.out.println("Heapsort is popular in embedded systems, real-time computing and the Linux kernel");
        System.out.println();



    }
    
}
