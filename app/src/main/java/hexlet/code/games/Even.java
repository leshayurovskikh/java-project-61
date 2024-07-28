package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void run() {
        var questions = new String [3][];
        for (int i = 0; i < 3; i++) {
            questions[i]= generateRound ();
        }
        Engine.metod (questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    public static String [] generateRound(){
        int minNumber = 1;
        int maxNamber = 10;
        int number = Utils.getRandomint (minNumber,maxNamber);
        var correctAnswer = isEven (number) ? "yes":"no";
        return new String[]{String.valueOf (number), String.valueOf (correctAnswer)};
    }
    public static boolean isEven (int number){
        return number%2==0;
    }
}
