package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void chetNotchet() {
        Scanner scanner = new Scanner(System.in);
        Cli.next();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: 15");
        String q1 = scanner.next();
        System.out.println("Your answer: "+q1);
        if (q1.equals("no")) {
            System.out.println("Correct");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + Cli.userName);

        }
        System.out.println("Question: 6");
        System.out.println("Your answer:");
        String q2 = scanner.next();
        System.out.println("Your answer: "+q2);
        if (q2.equals("yes")){
            System.out.println("Correct");
        }else{
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                    "Let's try again, " + Cli.userName);
        }
        System.out.println("Question: 7");
        System.out.println("Your answer:");
        String q3 = scanner.next();
        System.out.println("Your answer: "+q3);
        if(q3.equals("no")){
            System.out.println("Correct");
        }else{
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + Cli.userName);
        }
        System.out.println("Congratulations, "+Cli.userName+"!");
    }
}
