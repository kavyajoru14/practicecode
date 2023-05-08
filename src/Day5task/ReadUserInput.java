package Day5task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {

    public static void main(String[] args) {

        // create a new BufferedReader object to read input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // prompt the user for input
        System.out.println("Please enter some text:");

        try {
            // read the user's input
            String userInput = reader.readLine();
            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            // close the reader when finished
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
