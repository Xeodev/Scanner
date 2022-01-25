package scannerExample;

import java.util.Scanner;

public class UserInputTester {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("Enter a String value");
            String userInput = keyboard.nextLine();
            System.out.println("User Input:  " + userInput);

        } catch (Exception ex) {
            ex.getLocalizedMessage();

        } finally {
            keyboard.close();

        }
    }
}
