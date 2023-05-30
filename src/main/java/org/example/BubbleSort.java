package org.example;

import java.util.Date;

public class BubbleSort {

    public static final String[] words = TxtToArray.populateArray();
    public static void bubbleSortSingle(String[] a) {

        String temp;

        Date past = new Date();

        System.out.println("I am sorting, this may take some time.");

        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[j].compareTo(words[i]) < 0) {

                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;

                }
            }

           // System.out.println(words[i]);


        }

        Date future = new Date();

        System.out.println("Time to sort: " + (future.getTime() - past.getTime()) + " milliseconds");


    }

}
