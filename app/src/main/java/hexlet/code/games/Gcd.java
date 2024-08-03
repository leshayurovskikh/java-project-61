package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
public static final int NUMBER_OF_ROUNDS = 3;
public static final int MIN_NUMBER = 1;
public static final int MAX_NUMBER = 10; 
    public static void run() {
        var questions = new String[NUMBER_OF_ROUNDS][];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.metod(questions, "Find the greatest common divisor of given numbers.");
    }

    public static String[] generateRound() {
        int a = Utils.getRandomint(MIN_NUMBER, MAX_NUMBER);
        int b = Utils.getRandomint(MIN_NUMBER, MAX_NUMBER);
        int gcd =  gcd(a, b);
        return new String[] {String.valueOf(a + " " + b), String.valueOf(gcd)};
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
