package sortbench;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtFileToArray {

    public static String[] populateArray() {

        // ArrayList of the words in words.txt
        List<String> listOfWords = new ArrayList<>();

        // A BufferedReader to load the data from the file
        try {

            BufferedReader BufferedReader = new BufferedReader(new FileReader("/Users/sam/Desktop/SortBench/sortbench/mit10000.txt"));

            String line = BufferedReader.readLine();

            while (line != null) {

                listOfWords.add(line);
                line = BufferedReader.readLine();

            }

            BufferedReader.close();

        } catch (IOException e) {

            System.err.println("Error: " + e);

        }

        // Adding words in the array list to an array
        String[] arrayOfWords = listOfWords.toArray(new String[0]);

        return arrayOfWords;

    }
    
}
