package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    final int cli = 1;
    final int even = 2;
    final int calc = 3;
    final int gcd = 4;
    final int progression = 5;
    final int prime = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        printMenu();
        int command = scanner.nextInt();

        switch (command) {
            case cli:
                System.out.println("Your choice: 1");
                Cli.next();
                break;
            case even:
                System.out.println("Your choice: 2");
                Even.run();
                break;
            case calc:
                System.out.println("Your choice: 3");
                Calc.run();
                break;
            case gcd:
                System.out.println("Your choice: 4");
                Gcd.run();
                break;
            case progression:
                System.out.println("Your choice: 5");
                Progression.run();
                break;
            case prime:
                System.out.println("Your choice: 6");
                Prime.run();
                break;
            case 0:
                System.out.println("Your choice: 0");
                System.out.println("Exit");
                break;
            default:
                System.out.println("Sorry, error");
        }
    }

        static void printMenu () {
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
        }
    }


