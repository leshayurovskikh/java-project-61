package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.gcd;

public class Gcd {
    public static void game4(){
    System.out.println("Find the greatest common divisor of given numbers.");
System.out.println("Question:" + Engine.generateNumber() + ""+Engine.gcd());
System.out.println("Your answer:");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    System.out.println("Your answer: "+ answer);
    if (gcd()==answer){
        System.out.println("Correct!");
    }else{
        System.out.println(answer+ "is wrong answer ;(. Correct answer was "+gcd()+"."+  +
                "Let's try again, "+ Cli.userName +"!");
    }
}
}
