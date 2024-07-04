package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calculator() {
        Cli.next();
        int a = Engine.generateNumber();
        int b = Engine.generateNumber();
        System.out.println("What is the result of the expression ?");
        System.out.println("Question: " + a +" * "+ b);
        System.out.println("Your answer:");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        System.out.println("Your answer: "+answer);
        int sum = a*b;
        if (answer==sum){
            System.out.println("Correct!");
        }else{
            System.out.println(answer+" is wrong answer ;(. Correct answer was + "+sum+".\n" +
                    "Let's try again, "+Cli.userName+"!");
            break;
        }
        int c = Engine.generateNumber();
        int d = Engine.generateNumber();
        int sum1 = c+d;
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + c +" + "+ d);
        System.out.println("Your answer:");
        int answer1 = scanner.nextInt();
        System.out.println("Your answer: "+answer1);
        if (answer1==sum1){
            System.out.println("Correct!");
        }else{
            System.out.println(answer1+" is wrong answer ;(. Correct answer was + "+sum1+".\n" +
                    "Let's try again, "+Cli.userName+"!");
            break;
        }
        int e = Engine.generateNumber();
        int f = Engine.generateNumber();
        int sum2 = e-f;
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + e +" - "+ f);
        System.out.println("Your answer:");
        int answer2 = scanner.nextInt();
        System.out.println("Your answer: "+answer2);
        if (answer1==sum1) {
            System.out.println("Correct!");

        } else {
            System.out.println(answer2+" is wrong answer ;(. Correct answer was + "+sum2+".\n" +
                    "Let's try again, "+Cli.userName+"!");
            break;
        }
        System.out.println("Congratulations, "+Cli.userName+"!");
    }

}
