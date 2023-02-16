package hexlet.code;

import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static final int TARGETWINCOUNT = 3;

    public static String greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                       Please enter the game number and press Enter.
                       1 - Greet
                       2 - Even
                       0 - Exit
                       Your choice:\s""");
        int chosenGame = scanner.nextInt();

        var name = "";

        if (chosenGame == 1) {
            greeting();
        } else if (chosenGame == 2) {
            name = greeting();
            Boolean gameResult = Even.game();
            if (gameResult) {
                System.out.println("Congratulations, " + name + "!");
            } else {
                System.out.println("Let's try again, " + name + "!");
            }
        }
    }
}
