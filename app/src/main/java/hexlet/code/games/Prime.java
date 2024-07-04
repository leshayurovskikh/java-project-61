package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
public class Prime {
    public static void game6() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rondom = new Random().nextInt();
        System.out.println("Question: " + rondom);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        boolean s = Engine.isSimple(rondom);
        System.out.println(s);
        if (s == true & answer.equals("yes")) {
            System.out.println("Correct!");
        } else {
            System.out.println("is wrong answer");
        }
    }
}
