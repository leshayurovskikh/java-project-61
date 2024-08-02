package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void run() {
        int numberOfRounds = 3;
        var questions = new String[numberOfRounds][];
        for (int i = 0; i < numberOfRounds; i++) {
            questions[i] = generateRound();
        }
        Engine.metod(questions, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String[] generateRound() {
        int minNumber = 1;
        int maxNumber = 10;
        int number = Utils.getRandomint(minNumber, maxNumber);
        var correctAnswer = isSimple(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), String.valueOf(correctAnswer)};
    }

   public static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
