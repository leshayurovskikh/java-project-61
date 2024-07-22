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
    int sequenceSize = Utils.getRandomint (5,10); //размер последовательности
    int firstNumber = 1; // первое число
    int step = 5; // шаг
    String[] array = new String[sequenceSize];
    int z = Utils.getRandomint (1,10);
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum = i*z;
        array[i] = Integer.toString (firstNumber+step*i);
    }
    return array;
}
}
