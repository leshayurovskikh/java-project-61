package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
public static final int NUMBER_OF_ROUNDS = 3;
public static final int MIN_NUMBER = 1;
public static final int MAX_NUMBER = 10;
    public static void run() {
        var questions = new String[NUMBER_OF_ROUNDS][];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.metod(questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String[] generateRound() {
        int number = Utils.getRandomint(MIN_NUMBER, MAX_NUMBER);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), String.valueOf(correctAnswer)};
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
