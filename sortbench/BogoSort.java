package sortbench;

import java.util.Date;
import java.util.Arrays;

public class BogoSort {

    public static void bogoSort(String[] a) {

        System.out.println("I am sorting, this may take some time.... or until the end of time who knows");

        // Starting point for calculating time.
        Date past = new Date();

        // Perform the sort on input array
        bogSort(a);

        // End point for calculating time.
        Date future = new Date();

        // Test to check that the array is sorted correctly.
        System.out.println(Arrays.toString(a));

        // Print the time taken for the algorithm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }

    // Perform a bogo sort on the array.
    public static void bogSort(String[] a) {


        while (!isSorted(a)) {

            shuffle(a);

        }

    }
    
    private static void shuffle(String[] a) {

        for (int i = 0; i < a.length; i++) {

            swap(a, i, (int)(Math.random() * i));

        }

    }

    private static void swap(String[] a, int i, int j) {

        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;  

    }


    private static boolean isSorted(String[] a) {

        for (int i = 1; i < a.length; i++) {

            if (a[i].compareTo(a[i - 1]) < 0) {

                return false;

            }

        }

        return true;

    }

    // Display info about the bogo sort algorithm.
    public static void bogoInfo() {

        System.out.println();
        System.out.println("About:");
        System.out.println("The Bogo sort algorithm is a sorting algorithm that is not useful for sorting outside of using it for educational purposes. It takes an unsorted list "
                          + "generates different permutations until it generates one that is sorted. It can be implemented to use either random permutations or deterministic permutations.");
        System.out.println();
        System.out.println("Performance:");
        System.out.println("Worst-case performance: Unbounded time complexity for randomised version. O(n x n!) time complexity for deterministic version.");
        System.out.println("Average: O(n x n!) time complexity.");
        System.out.println("Best-case: O(n) time complexity.");
        System.out.println("Memory: The worst-case space complexity is O(1).");
        System.out.println();
        System.out.println("Bogo sort's efficiency is why it is not used for sorting outside demonstrations. For any size list it could get a sorted permutation on it's first or first few generations."
                          + " or it could never sort it. Although this is unlikely for very small lists.");
        System.out.println();
        System.out.println("Trivia:");
        System.out.println("The name bogo sort is a blend of the words bogus and sort.");
        System.out.println();
        System.out.println("Related algorithms to bogo sort are:");
        System.out.println("Gorosort, Bogobogosort, Bozosort, Worstsort, Slowsort, Quantum bogosort and Miracle sort.");
        System.out.println();
        
    }

}
