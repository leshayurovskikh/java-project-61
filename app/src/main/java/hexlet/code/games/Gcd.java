package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.gcd;

public class Gcd {
    public static void game4(){
        String user = Cli.next();
    System.out.println("Find the greatest common divisor of given numbers.");
    int x = Engine.generateNumber();
    int y = Engine.generateNumber();
System.out.println("Question:" + x + ""+ y);
System.out.println("Your answer:");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    System.out.println("Your answer: "+ answer);
    int a =Engine.gcd(x, y);
    if (a==answer){
        System.out.println("Correct!");
    }else{
        System.out.println(answer+ "is wrong answer ;(. Correct answer was "+a+"."+
                "Let's try again, "+ user +"!");
    }
}
}
