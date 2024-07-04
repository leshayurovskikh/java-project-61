package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        printMenu();
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("Your choice: 1");
                Cli.next();
                break;
            case 2:
                System.out.println("Your choice: 2");
                Even.chetNotchet();
                break;
            case 3:
                System.out.println("Your choice: 3");
                Calc.calculator();
                break;
            case 4:
                System.out.println("Your choice: 4");
                Gcd.game4();
                break;
            case 5:
                System.out.println("Your choice: 5");
                Progression.game5();
                break;
            case 6:
                System.out.println("Your choice: 6");
                Prime.game6();
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


