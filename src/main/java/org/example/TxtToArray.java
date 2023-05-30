package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtToArray {

    public static String[] populateArray() {

        // ArrayList of the words in words.txt
        List<String> listOfWords = new ArrayList<>();

        // A bufferedReader to load the data from the file
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\sam\\Desktop\\SortBench\\src\\main\\java\\org\\example\\mit10000.txt"));

            String line = bufferedReader.readLine();

            while (line != null) {

                listOfWords.add(line);
                line = bufferedReader.readLine();

            }

            bufferedReader.close();

        } catch (IOException e) {

            System.err.println("ERROR: " + e);

        }

        // Adding words in the array list to an array
        String[] arrayOfWords = listOfWords.toArray(new String[0]);

        return arrayOfWords;

    }

}
