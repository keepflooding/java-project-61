package hexlet.code;

import hexlet.code.games.Greet;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int chosenGame = -1;

        Scanner scanner = new Scanner(System.in);

        while (chosenGame != 0) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            chosenGame = scanner.nextInt();

            if (chosenGame == 1) {
                System.out.println("Welcome to the Brain Games!");
                Greet.greeting();
            }

        }

    }
}
