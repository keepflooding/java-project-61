package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
