package Pack1;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 0 and 9
       // System.out.print("Please enter a number between 0 and 9: ");
        
        // Read the input from the user
        int number = scanner.nextInt();
  
            // Use a switch statement to determine the word representation
            String word;
            switch (number) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                default:
                    word = "Invalid number"; // This case will never be hit due to previous validation
            }
            // Print the word representation
            System.out.println(word);

        // Close the scanner
        scanner.close();
    }
}
