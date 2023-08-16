package sortbench;

import java.util.Date;

public class BubbleSort {

    // Convert the text file to an array
    public static final String[] words = TxtFileToArray.populateArray();

    // Perform a bubble sort on the array.
    public static void bubbleSort(String[] a) {

        String temp;

        System.out.println("I am sorting, this may take some time.");

        // Starting point for calculating time.
        Date past = new Date();
            
        for (int i = 0; i < words.length; i++) {
            
            for (int j = i + 1; j < words.length; j++) {

                if (words[j].compareTo(words[i]) < 0) {

                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;

                }

            }

            // Test to see if the array is sorted.
            // System.out.println(words[i]);

        }

        Date future = new Date();

        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");
        
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
