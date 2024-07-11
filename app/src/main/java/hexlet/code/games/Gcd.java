package hexlet.code.games;
import hexlet.code.Utils;

import java.util.Scanner;
public class Gcd {
    public static void game4(){
        String user = Cli.next();
    System.out.println("Find the greatest common divisor of given numbers.");
    int x = Utils.getRandomint(1,10);
    int y = Utils.getRandomint(1,10);
System.out.println("Question:" + x + ""+ y);
System.out.println("Your answer:");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    System.out.println("Your answer: "+ answer);
    int a =Utils.gcd(x, y);
    if (a==answer){
        System.out.println("Correct!");
    }else{
        System.out.println(answer+ "is wrong answer ;(. Correct answer was "+a+"."+
                "Let's try again, "+ user +"!");
    }
}
}
