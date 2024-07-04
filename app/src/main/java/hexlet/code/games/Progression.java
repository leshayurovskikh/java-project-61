package hexlet.code.games;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Progression {
    public  static void game5 (){
        String user = Cli.next();
       System.out.println ("What number is missing in the progression?");
    int rondom = new Random().nextInt(5);
    String[] array  = {"2", "4", "6", "8", "10"};
    String c = array[rondom];
    array[rondom]="..";
        System.out.println (Arrays.toString (array));
        System.out.println ("Ваш ответ?");
    Scanner sc = new Scanner (System.in);
    String answer = sc.next();
if (answer.equals (c)){
        System.out.println ("Correct");
    }else {
    System.out.println(answer+" is wrong answer ;(. Correct answer was " + c+".\n" +
            "Let's try again, " + user);
    }
}
}
