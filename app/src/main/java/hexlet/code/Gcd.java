package hexlet.code;
import java.util.Scanner;
public class Gcd {
    System.out.println("Find the greatest common divisor of given numbers.");
System.out.println("Question:" + Engine.agcd + ""+Engine.bgcd);
System.out.println("Your answer:");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    System.out.println("Your answer: "+ answer);
    if (Engine.GCD==answer){
        System.out.println("Correct!");
    }else{
        System.out.println(answer+ "is wrong answer ;(. Correct answer was "+gcd()+"."+\n +
                "Let's try again, "+Cli.userName+"!");
    }
}
}
