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
        String array  = getStringMas();
        String[] words = array.split(",");
        String c = words[number];
        words[number]="..";

        return new String[]{String.valueOf (Arrays.toString (words)), String.valueOf (c)};
    }
public static String getStringMas (){
    int a = Utils.getRandomint (1,3);
    String mas = "";
    if (a==1){
        mas = "2,4,6,8,10";

    } else if (a==2) {
        mas = "4,6,8,10,12";

    } else if (a==3) {
        mas = "3,6,9,12,15";

    }
    return mas;
}
}
