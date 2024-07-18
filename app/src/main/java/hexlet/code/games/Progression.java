package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Progression {
    public static void run() {
        var questions = new String [3][];
        for (int i = 0; i < 3; i++) {
            questions[i]= generateRound ();
        }
        Engine.metod (questions, "What number is missing in the progression?");

    }
    public static String [] generateRound(){
        int number = Utils.getRandomint (1,4);
        String[] words = getStringMas();
        String c = words[number];
        words[number]="..";

        return new String[]{String.valueOf (Arrays.toString (words)), String.valueOf (c)};
    }
public static String[] getStringMas (){
    String[] array = new String[Utils.getRandomint (5,10)];
    int step = 0;
    int z = Utils.getRandomint (1,10);
    int sum = 0;
    for (int i = step; i < array.length; i++) {
        sum = i*z;
        array[i] = Integer.toString (sum);
    }
    return array;
}
}
