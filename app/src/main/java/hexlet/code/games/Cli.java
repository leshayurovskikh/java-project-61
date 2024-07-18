package hexlet.code.games;
import java.util.Scanner;
public class Cli {
    public static String userName;

    public static String next() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
