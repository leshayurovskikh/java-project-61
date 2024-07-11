package hexlet.code.games;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;
public class Prime {
    public static void game6() {
        String user = Cli.next();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rondom = new Random().nextInt();
        System.out.println("Question: " + rondom);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        boolean s = Utils.isSimple(rondom);
        if (s == true & answer.equals("yes")) {
            System.out.println("Correct!");
        } else if (s == false & answer.equals("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                    "Let's try again, " + user);
        }
    }
}
