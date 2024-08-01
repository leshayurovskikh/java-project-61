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
        int sequenceSize = Utils.getRandomint (5,10); //размер последовательности
        int firstNumber = 1; // первое число
        int step = 5; // шаг
        String[] words = getStringMas(sequenceSize, firstNumber, step);
        String c = words[number];
        words[number]="..";
        return new String[]{String.valueOf (Arrays.toString (words)), String.valueOf (c)};
    }
    
public static String[] getStringMas (int sequenceSize, int firstNumber, int step){
    String[] array = new String[sequenceSize];
        for (int i = 0; i < array.length; i++) {
        array[i] = Integer.toString (firstNumber+step*i);
        }
        return array;
    }
}
