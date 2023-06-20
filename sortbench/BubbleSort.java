package sortbench;

import java.util.Date;

public class BubbleSort {

    public static final String[] words = TxtFileToArray.populateArray();
    public static void bubbleSort(String[] a) {

        String temp;

        // Starting point for calculating time.
        Date past = new Date();

        System.out.println("I am sorting, this may take some time.");

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {

                if (words[j].compareTo(words[i]) < 0) {

                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;

                }

            }

            // System.out.println(words[i]);

        }

        // End point for calculating time
        Date future = new Date();

        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");
        
    }
    
}
