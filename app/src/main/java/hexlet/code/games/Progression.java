package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
public static final int NUMBEROFROUNDS = 3;
public static final int FIRST_NUMBER = 1;
public static final int S = 5;
public static final int SEQMIN = 5;
public static final int SEQMAX = 10;
public static final int MAX = 5;
public static final int MIN = 1;

    public static void run() {
        var questions = new String[NUMBEROFROUNDS][];
        for (int i = 0; i < NUMBEROFROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.metod(questions, "What number is missing in the progression?");
    }

   public static String[] generateRound() {
        int number = Utils.getRandomint(SEQMIN, SEQMAX);
        int sequenceSize = Utils.getRandomint(SEQMIN, SEQMAX);
        String[] words = getStringMas(sequenceSize, FIRST_NUMBER, S);
        String c = words[number];
        words[number] = "..";
        return new String[] {String.join(" ", words), String.valueOf(c)};
    }

public static String[] getStringMas(int sequenceSize, int FIRST_NUMBER, int S) {
    String[] array = new String[sequenceSize];
        for (int i = 0; i < array.length; i++) {
        array[i] = Integer.toString(FIRST_NUMBER + S * i);
        }
        return array;
    }
}
