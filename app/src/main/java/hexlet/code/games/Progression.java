package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void run() {
        var questions = new String [3][];
        for (int i = 0; i < 3; i++) {
            questions[i]= generateRound ();
        }
        Engine.metod (questions, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");

    }
    public static String [] generateRound(){
        int number = Utils.getRandomint (1,10);
        var correctAnswer = isSimple (number) ? "yes":"no";
        return new String[]{String.valueOf (number), String.valueOf (correctAnswer)};
    }
    public static boolean isSimple(int number) {
        if(number < 2) return false;
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
