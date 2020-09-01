//ATM: Prompt the user for a PIN. Display an error message if the user gets it wrong, and prompt again. If the user gets it right, print a congratulatory message.
//
//Stretch goal: quit after three failed attempts with an apologetic message.
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempt = 0;
        int guesses = 3;
        int pin = 1234;

        System.out.println("Please enter your 4-digit Pin:");
        do {

            attempt = Integer.parseInt(input.nextLine()); //turn the input into an integer
            if (attempt == pin) {
                System.out.println("Welcome, 007");
            } else {
                System.out.println("Please try again");
                guesses--;
                if (guesses == 0) {
                    System.out.println("You have exhausted your guesses, your account is now locked.");
                }
            }
        }while (attempt != pin && guesses > 0);
    }
}