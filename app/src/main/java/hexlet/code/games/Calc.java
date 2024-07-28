package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;
public class Calc {
    public static void run() {
        var questions = new String [3][];
        for (int i = 0; i < 3; i++) {
            questions[i]= generateRound ();
        }
        Engine.metod (questions, "What is the result of the expression?");
    }
   public static String[] generateRound() {
        int a = Utils.getRandomint (1, 10);
        int b = Utils.getRandomint (1, 10);
        char[] myArray = new char[] {'-', '+', '*'};
        String operand = String.valueOf (myArray[(Utils.getRandomint(0,myArray.length))]);

        String question = Integer.toString (a)+" "+operand+" "+Integer.toString (b);
        String res = String.valueOf (generateOperations (a,b,operand));
        return new String[]{String.valueOf (question), String.valueOf (res)};

    }

    public static int generateOperations(int one, int two, String operand) {
        int result = 0;
        switch (operand) {
            case "+":
                return result = one + two;
            case "-":
               return result = one - two;
            case "*":
                return result = one * two;
        }
return result;
    }
}
