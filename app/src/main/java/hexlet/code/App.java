package hexlet.code;
import java.util.Scanner;
public class App {
    Scanner scanner = new Scanner(System.in);
              System.out.println ("Please enter the game number and press Enter.");
while (true){
        printMenu();
        int command = scanner.nextInt();
        if (command==1){
            System.out.println("Your choice: 1");
            Cli.next();
        } else if (command == 2) {
            System.out.println("Your choice: 2");
            Even.chetNotchet();
        } else if (command == 3) {
            System.out.println("Your choice: 3");
            Calc.calculator();
        } else if (command == 4) {
            System.out.println("Your choice: 4");
            Cli.next();
            Gcd.game4();
        } else if (command == 5) {
            System.out.println("Your choice: 5");
            Cli.next();
            Progression.game5();
        }else if ( command == 0) {
            System.out.println("Your choice: 0");
            System.out.println("Exit");
            break;
        }else {
            System.out.println("Sorry, error");
        }
    }

}
static  void printMenu (){
    System.out.println("1 - Greet");
    System.out.println("2 - Even");
    System.out.println("3 - Calc");
    System.out.println("4 - GCD");
    System.out.println("5 - Progression");
    System.out.println("0 - Exit");
    System.out.println("Welcome to the Brain Games!");
    Cli.next();
}
    }
}
