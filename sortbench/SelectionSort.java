package sortbench;

import java.util.Date;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(String[] a) {

        System.out.println("I am sorting, this may take some time");

        // Starting point for calculating time
        Date past = new Date();

        selSort(a);

        // End point for calculating time
        Date future = new Date();

        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

        // Test to check that the array is sorted correctly
        //System.out.println(Arrays.toString(a));

    }

    public static void selSort (String[] a) {

        int arrayLength = a.length;


        for(int i = 0; i < arrayLength - 1; i++) {

            String min = a[i];
            int indexMin = i;

            for (int j = i + 1; j < arrayLength; j++) {

                if (a[j].compareTo(min) < 0) {

                    min = a[j];
                    indexMin = j;

                }

            }

            swap(a, i, indexMin);

        }

    }

    private static void swap(String[] a, int x, int y) {

        String temp = a[x];

        a[x] = a[y];
        a[y] = temp;
    
    }
    
}
