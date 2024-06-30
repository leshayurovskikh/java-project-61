package hexlet.code;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Progression {
    public  static void game5 (){
       System.out.println ("What number is missing in the progression?");
    int rondom = new Random().nextInt(5);
    String[] array  = {"2", "4", "6", "8", "10"};
    String c = array[rondom];
    array[rondom]="..";
        System.out.println (Arrays.toString (array));
        System.out.println (c);
        System.out.println ("Ваш ответ");
    Scanner sc = new Scanner (System.in);
    String answer = sc.next();
if (answer.equals (c)){
        System.out.println ("correct");
    }else {
        System.out.println ("not correct" );
    }
}
}
