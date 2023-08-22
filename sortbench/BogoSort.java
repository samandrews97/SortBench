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

}
