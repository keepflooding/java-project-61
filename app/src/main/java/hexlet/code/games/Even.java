package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.App.TARGETWINCOUNT;

public class Even {
    static final int MAXNUMBERVALUE = 100;
    public static Boolean game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int winCount = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (winCount < TARGETWINCOUNT) {
            System.out.println("Question: ");
            int number = random.nextInt(MAXNUMBERVALUE);
            String correctAnswer = (number % 2 == 0 ? "yes" : "no");

            System.out.println(number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                winCount++;
            } else {
                System.out.format("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answer,
                        correctAnswer);
                return false;
            }
        }

        return true;
    }
}
