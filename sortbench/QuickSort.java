package sortbench;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class QuickSort {

    public static void quickSort(String[] a) {

        System.out.println("I am sorting, this may take some time");

        // Starting point for calculating time.
        Date past = new Date();

        // Perform a quick sorty on the array.
        quickSort(a, 0, a.length - 1);

        // End point for calculating time.
        Date future = new Date();  

        // Test to check that the array is sorted correctly.
        //System.out.println(Arrays.toString(a));

        // Print the time taken for the algorithm to complete the sort.
        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");

    }

    // Perform a quick sort on the array.
    public static void quickSort(String[] a, int lowIndex, int highIndex) {

        // If our partitions are a single item break out of the recursive calling.
        if (lowIndex >= highIndex) {

            return;

        }

        // Use a random pivot point in the list.
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        String pivotPoint = a[pivotIndex];
        // Put it at the end of the list.
        swap(a, pivotIndex, highIndex);

        int leftPointer = partition(a, lowIndex, highIndex, pivotPoint);

        // Recursively call quicksort on partitions.
        quickSort(a, lowIndex, leftPointer - 1);
        quickSort(a, leftPointer + 1, highIndex);


    }

    // Function to create partitions around the pivot point.
    private static int partition(String[] a, int lowIndex, int highIndex, String pivotPoint) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // While our left pointer (starts at the beginning of the list) and our right pointer (starts at the end of the list)
        // are not pointing to the same index and the item at their index is before or after the pivot item respecitvely, 
        // increment and decrement them. Doing swaps where appropriate.
        while (leftPointer < rightPointer) {

            while (a[leftPointer].compareTo(pivotPoint) <= 0 && leftPointer < rightPointer) {

                leftPointer++;

            }

            while (a[rightPointer].compareTo(pivotPoint) >= 0 && leftPointer < rightPointer) {

                rightPointer--;

            }

            swap(a, leftPointer, rightPointer);

        }

        swap(a, leftPointer, highIndex);

        return leftPointer;

    }

    // Helper function to swap elements at given indexes.
    private static void swap(String[] a, int index1, int index2) {

        String temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

    }

    // Display info about the quick sort algorithm.
    public static void quickInfo() {

        System.out.println();
        System.out.println("About:");
        System.out.println("The Quick sort algorithm is an efficient divide-and-conquer algorithm. It uses an element in a list as a pivot point and then creates "
                           + "two partitions. The partition to the left of the pivot point is populated with items that need to come before the pivot point value and the one "
                           + "to the right the items that need to come after. This is called recursively the list is sorted.");
        System.out.println();
        System.out.println("Performance:");
        System.out.println("Worst-case: O(n\u00b2) time complexity.");
        System.out.println("Average: O(nlogn) time complexity.");
        System.out.println("Best-case: O(nlogn) for simple partition and O(n) for three-way partion and equal keys");
        System.out.println("Memory: The worst-case space complexity is O(n) auxiliary for a naive implemementation or O(nlogn) auxiliary otherwise.");
        System.out.println();
        System.out.println("Quick sort is a very efficient algorithm, both in terms of time and memory usage. It competes with Heap Sort and Merge Sort.");
        System.out.println();
        System.out.println("Trivia:");
        System.out.println("The algorithm was created in 1959 by Tony Hoare and its details published in 1961.");
        System.out.println();
        System.out.println("It is still in use today with many programs using it as their default sort method, or as a hybrid method in combination with another sort (e.g. merge sort).");
        System.out.println();
        System.out.println("Soem variations of the Quick sort algorithm are:");
        System.out.println("Multi-pivot quicksort, External quicksort, Three-way radix quicksort, Quick radix sort, BlockQuicksort, Partial and Incremental quicksort.");
        System.out.println();
        
    }
}
