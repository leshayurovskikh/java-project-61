package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static boolean checkAnswer(String userAnswer, String correctAnswer){
        return userAnswer.equals (correctAnswer);
    }
    public static void correctAnswer(){
        System.out.println ("Correct" );
    }
    public static void wrongAnswer(String userName, String correctAnswer, String userAnswer){
        System.out.println (userAnswer+ " is wrong answer ;(. Correct answer was "+correctAnswer+".");
        System.out.println ("Let's try again, " + userName + "!" );
    }
    public static String getUserName(){
        System.out.println ("Welcome to the Brain Games!");
        System.out.println ("May I have your name?");
        Scanner scanner = new Scanner (System.in);
        String userName = scanner.next ();
        System.out.println ("Hello, "+userName);
        return userName;
    }
    public static String getSumNumber(int a, int b){
        int sum = a+b;
        return preparation (sum);
    }
    public static String getSubtrNumber(int a, int b){
        int subtr = a-b;
        return preparation (subtr);
    }
    public static String getMultNumber (int a, int b){
        int mult = a*b;
        return preparation (mult);
    }

    public static String preparation(int sum){
        return Integer. toString (sum);
    }

}

