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
    public static String [] generateRound(){
        int a = Utils.getRandomint (1,10);
        int b = Utils.getRandomint (1,10);
        String result = generateOperations();
        int sum = 0;
        if (result.equals (" + ")) {
            sum = a + b;
        }else if (result.equals(" - ")){
            sum = a-b;
        }else if (result.equals(" * ")){
            sum = a*b;
        }
        return new String[]{String.valueOf (a+result+b), String.valueOf (sum)};
    }
    public static String generateOperations() {
        int generate = Utils.getRandomint (1, 3);
        String result = "";
        if (generate == 1) {
            result = " + ";
        } else if (generate == 2) {
            result = " - ";
        } else if (generate == 3) {
            result = " * ";
        }
        return result;
    }
}
