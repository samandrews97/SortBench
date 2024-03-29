package sortbench;

import java.util.Arrays;
import java.util.Date;

public class InsertionSort {

    public static void insertionSort(String[] a) {

        System.out.println("I am sorting, this may take some time");

        // Starting point for calculating time.
        Date past = new Date();

        // Perform the sort on input array.
        insSort(a);

        // End point for calculating time.
        Date future = new Date();

        // Test to check that the array is sorted correctly.
        //System.out.println(Arrays.toString(a));

        // Print the time taken for the alogirthm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");
    }

    // Perform an insertion sort on the array.
    public static void insSort(String[] a) {

        for (int i = 1; i < a.length; i++) {

            // If ever at index 0 continue to for loop to increment.
            if (i == 0) {

                continue;
            
            } else if (a[i].compareTo(a[i - 1]) > 0) {  // If our String comes after the one in the previous index continue to for loop to increment.

                continue;

            } else if (a[i].compareTo(a[i - 1]) < 0) { // If our String comes before the one in the previous index swap them.

                String temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;

                // Decrement by -2 so after the increment we are at a[i - 1] which is where we just put our smaller swapped element.
                i -= 2;

            }

        }

    }

    // Display info about the insertion sort algorithm.
    public static void insertionInfo() {

        System.out.println();
        System.out.println("About:");
        System.out.println("The Insertion sort algorithm is a simple comparison algorithm. It compares each element"
                           + " of a list to the one before it (apart from the element at position 0, this is compared when looking at element 1). Depending on the constraint it will swap those items and then check again"
                           + " with the element and the one before it at the elements' new position. This repeats until the element meets the constraint."
                           + " This process is repeated until the list is sorted as desired.");
        System.out.println();
        System.out.println("Performance:");
        System.out.println("Worst-case: O(n\u00b2) time complexity. This is comprised of O(n\u00b2) comparisons and O(n\u00b2) swaps.");
        System.out.println("Average: O(n\u00b2) time complexity. This is comprised of O(n\u00b2) comparisons and O(n\u00b2) swaps.");
        System.out.println("Best-case: O(n) time complexity. This is comprised of O(n) comparisons and O(1) swaps.");
        System.out.println("Memory: The worst-case space complexity is O(n) total and O(1) auxilliary.");
        System.out.println();
        System.out.println("Insertion sort is efficient for smaller data sets. In practice it is more efficient than Selection sort or Bubble sort.");
        System.out.println();
        System.out.println("Trivia:");
        System.out.println("When people sort playing cards in a bridge hand, a common method is similar to that of the Insertion sort.");
        System.out.println();
        System.out.println("The algorithm was originally described by John Mauchly in the first published discussion on computer sorting in 1946.");
        System.out.println();
        System.out.println("Some variations of the Insertion sort are:");
        System.out.println("D.L. Shell's Shell sort, Binary merge sort, and in 2006 Bender, Martin Farach-Colton and Mosteiro created a variant known as Library sort or Gapped insertion sort.");
        System.out.println();

    }
    
}
