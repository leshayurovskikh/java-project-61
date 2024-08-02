package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    public static void run() {
        var questions = new String[3][];
        for (int i = 0; i < 3; i++) {
            questions[i] = generateRound();
        }
        Engine.metod(questions, "Find the greatest common divisor of given numbers.");
    }

    public static String[] generateRound() {
        int a = Utils.getRandomint(1, 10);
        int b = Utils.getRandomint(1, 10);
        int gcd =  gcd(a, b);
        return new String[] {String.valueOf(a + " " + b), String.valueOf(gcd)};
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
