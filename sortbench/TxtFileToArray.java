package sortbench;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;

public class TxtFileToArray {

    // Convert the words in a textfile to an array to be used by sorting algorithms.
    public static String[] populateArray() {

        // ArrayList of the words in words.txt
        List<String> listOfWords = new ArrayList<>();

        InputStream inputFile = TxtFileToArray.class.getResourceAsStream("mit10000.txt");

        // A BufferedReader to load the data from the file.
        try {

            BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(inputFile));

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
