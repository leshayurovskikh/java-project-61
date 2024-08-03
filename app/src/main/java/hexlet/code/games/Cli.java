package hexlet.code.games;
import java.util.Scanner;
public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static void next() {
       System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
