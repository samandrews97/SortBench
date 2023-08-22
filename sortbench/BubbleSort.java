package sortbench;

import java.util.Arrays;
import java.util.Date;

public class BubbleSort {  

    public static void bubbleSort(String[] a) {

        System.out.println("I am sorting, this may take some time.");

        // Starting point for calculating time.
        Date past = new Date();

        // Perform sort on input array.
        bubSort(a);

        // End point for calculating time.
        Date future = new Date();

        // Test to check that the array is sorted correctly.
        //System.out.println(Arrays.toString(a));

        // Print the time taken for the algorithm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }

    // Perform a bubble sort on the array.
    public static void bubSort(String[] a) {

        // Flag for if the list still requires sorts.
        boolean swappedItems = true;

        while (swappedItems) {

            swappedItems = false;

            for (int i = 0; i < a.length - 1; i++) {

                // If element at current index comes after the one at the next index we need to swap them.
                if (a[i].compareTo(a[i + 1]) > 0) {

                    // Set flag to true that two items need swapped.
                    swappedItems = true;
                    String temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                }

            }

        }
        
    }

    // Display info about the bubble sort to terminal output.
    public static void bubbleInfo() {

        System.out.println();
        System.out.println("About:");
        System.out.println("The Bubble sort algorithm is a simple, comparison sorting algorithm that repeatedly goes through a"
                            + " list comparing adjacent items, swapping them if they are not in the correct order.");
        System.out.println();
        System.out.println("Performance:");
        System.out.println("Worst-case: O(n\u00b2) time complexity. This is comprised of O(n\u00b2) comparisons and O(n\u00b2) swaps.");
        System.out.println("Average: O(n\u00b2) time complexity. This is comprised of O(n\u00b2) comparisons and O(n\u00b2) swaps.");
        System.out.println("Best-case: O(n) time complexity. This is comprised of O(n) comparisons and O(1) swaps.");
        System.out.println("Memory: The worst-case space complexity is O(n) total and O(1) auxiliary.");
        System.out.println();
        System.out.println("In real world use with large unsorted lists, Bubble sort performs poorly. As such, it is rarely used.");
        System.out.println();
        System.out.println("Trivia:");
        System.out.println("The Bubble sort is also known as the Sinking sort.");
        System.out.println();
        System.out.println("The earliest description of the algorithm was by Edward Harry Friend in 1956.");
        System.out.println();
        System.out.println("In 2007 Google CEO Eric Schmidt asked to-be predisdent Barack Obama what the best way to sort one million integers is," 
                            + " Obama replied 'I think the bubble sort would be the wrong way to go'");
        System.out.println();

    }
    
}
