package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
public static final int MIN_NUMBER = 1;
public static final int MAX_NUMBER = 10;
public static final int NUMBER_OF_ROUNDS = 3;
    public static void run() {
        var questions = new String[NUMBER_OF_ROUNDS][];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.metod(questions, "What is the result of the expression?");
    }

   public static String[] generateRound() {
        int a = Utils.getRandomint(MIN_NUMBER, MAX_NUMBER);
        int b = Utils.getRandomint(MIN_NUMBER, MAX_NUMBER);
        char[] myArray = new char[] {'-', '+', '*'};
        String operand = String.valueOf(myArray[(Utils.getRandomint(0, myArray.length))]);

        String question = Integer.toString(a) + " " + operand + " " + Integer.toString(b);
        String res = String.valueOf(generateOperations(a, b, operand));
        return new String[] {String.valueOf(question), String.valueOf(res)};
    }

    public static int generateOperations(int one, int two, String operand) {
       if (operand.equals("+")) {
            return one + two;
        } else if (operand.equals("-")) {
            return one - two;
        } else {
            return one * two;
        }
    }
}
