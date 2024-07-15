package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;
public class Calc {
    public static String generateOperations() {
        int generate = Utils.getRandomint (1, 3);
        String result = "";
        if (generate == 1) {
            result = "+";
        } else if (generate == 2) {
            result = "-";
        } else if (generate == 3) {
            result = "*";
        }
        return result;
    }
    public static String questions(String result, int a, int b){
        switch (result){
            case "+":
                System.out.println ("What is the result of the expression?" );
                System.out.println ("Question: " + a + " + " + b);
                return Engine.getSumNumber (a,b);
            case  "-":
                System.out.println ("What is the result of the expression?" );
                System.out.println ("Question: " + a + " - " + b );
                return Engine.getSubtrNumber(a, b);
            case "*":
                System.out.println ("What is the result of the expression?" );
                System.out.println ("Question: " + a + " * " + b );
                return Engine.getMultNumber (a, b);
        }
        return result;
    }
    static String userName = Engine.getUserName ();
    public static void run(){
        for (int i = 0; i < 3; i++) {

            int a = Utils.getRandomint (1,10);
            int b = Utils.getRandomint (1,10);
            String result = generateOperations ();
            String correctAnswer =  questions (result, a, b);
            Scanner scanner = new Scanner (System.in);
            String userAnswer = scanner.next ();
            System.out.println ("Your answer: " + userAnswer );
            boolean checkResult = Engine.checkAnswer (userAnswer, correctAnswer);
            if (checkResult==true){
                Engine.correctAnswer();
            }else{
                Engine.wrongAnswer (userName, correctAnswer, userAnswer);
            }
        }
    }
}
