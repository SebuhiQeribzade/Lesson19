package Lesson19Mentor;
import java.util.Scanner;

public class MSmain {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you believe in God? (Yes or No):");
            String answer1 = scanner.nextLine().toLowerCase();
            System.out.println("Do you live your life as he says? (Yes or No):");
            String answer2 = scanner.nextLine().toLowerCase();
            MyStyle variation = determineVariation(answer1, answer2);
            System.out.println("You are a: " + variation);
        }


    public static MyStyle determineVariation(String answer1, String answer2) {
        if (answer1.equals("yes") && answer2.equals("yes")) {
            return MyStyle.WORSHIPER;
        } else if (answer1.equals("yes") && answer2.equals("no")) {
            return MyStyle.LIAR;
        }
        else if (answer1.equals("no") && answer2.equals("no")) {
            return MyStyle.NONBELIEVER;
        }
        else {
            throw new IllegalArgumentException("Your answer is incorrect");
        }
    }
}

