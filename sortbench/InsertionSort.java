package sortbench;

import java.util.Arrays;
import java.util.Date;

public class InsertionSort {

    public static final String[] words = TxtFileToArray.populateArray();

    public static void insertionSort(String[] a) {

        String temp;

        System.out.println("I am sorting, this may take some time");

        // Starting point for calculating time
        Date past = new Date();

        for (int i = 0; i < words.length; i++) {

            if (i == 0) {

                continue;

            } else if (words[i].compareTo(words[i - 1]) > 0) {

                continue;

            } else if (words[i].compareTo(words[i - 1]) < 0) {

                temp = words[i - 1];
                words[i - 1] = words[i];
                words[i] = temp;

                i -= 2;

            }

        }

        Date future = new Date();

        // Test to check that the array is sorted correctly.
        // System.out.println(Arrays.toString(words));

        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }
    
}
