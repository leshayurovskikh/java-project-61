package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
public static final int NUMBER_OF_ROUNDS = 3;
public static final int FIRST_NUMBER = 1;  
public static final int STEP = 5;    
public static final int SEQ_MIN = 5; 
public static final int SEQ_MAX = 10;
public static final int MAX = 5;
public static final int MIN = 1;    
    
    public static void run() {
        var questions = new String [NUMBER_OF_ROUNDS][];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.metod(questions, "What number is missing in the progression?");
    }

   public static String[] generateRound() {
        int number = Utils.getRandomint(MIN, MAX);
        int sequenceSize = Utils.getRandomint(SEQ_MIN, SEQ_MAX);
        String[] words = getStringMas(sequenceSize, FIRST_NUMBER, STEP);
        String c = words[number];
        words[number] = "..";
        return new String[] {String.join(" ", words), String.valueOf(c)};
    }

public static String[] getStringMas(int sequenceSize, int FIRST_NUMBER, int STEP) {
    String[] array = new String[sequenceSize];
        for (int i = 0; i < array.length; i++) {
        array[i] = Integer.toString(FIRST_NUMBER + STEP * i);
        }
        return array;
    }
}
