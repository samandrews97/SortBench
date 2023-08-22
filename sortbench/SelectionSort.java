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

    // Display info about the selection sort algorithm.
    public static void selectionInfo() {

        System.out.println();
        System.out.println("About:");
        System.out.println("The Selection sort is an in-place comparison algorithm. Say the list to be sorted contains numbers and it has to be sorted smallest to largest."
                          + " Selecrtion sort will set the first index as the minimum value, it will then compare this value to every other one in the list. If the first index is"
                          + " the minimum it moves on to the next index. If not it swaps it with the index that is the minimum. Once an index is sorted it is never compared again."
                          + " This is repeated until the list is sorted.");
        System.out.println();
        System.out.println("Performance:");
        System.out.println("Worst-case: O(n\u00b2) time complexity. This is comprised of O(n\u00b2) comparisons and O(n) swaps.");
        System.out.println("Average-case: O(n\u00b2) time complexity. This consists of O(n\u00b2) comparisons and O(n) swaps.");
        System.out.println("Best-case: O(n\u00b2) time complexity. This is comprised of O(n\u00b2) comparisons and O(1) swaps.");
        System.out.println("Memory: The worst-case space complexity is O(1) auxiliary.");
        System.out.println();
        System.out.println("Selection sort is not an efficient sorting algorithm. This in-efficiency builds as the size of the list to sort does.");
        System.out.println();
        System.out.println("Trivia:");
        System.out.println("Is an almost-always-faster sorting algorithm than Bubble sort and Gnome sort.");
        System.out.println();
        System.out.println("Some variations of the Inserstion sort are:");
        System.out.println("Heapsort, Double selection sort/Cocktail sort, Stable sort and Bingo sort.");
        System.out.println();
        
    }
    
}
