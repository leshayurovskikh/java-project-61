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
     public static Character generateOperations() {
        int generate = Utils.getRandomint (0, 2);
       Character[] myArray = new Character [] {'-','+','*'};
        return myArray[generate];
    }
}
