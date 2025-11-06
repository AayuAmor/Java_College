package Aayush_Java_Practice;
import java.util.*;

public class Weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number (1-7):");
        int week = sc.nextInt();
        System.out.println("Enter the time (a = Afternoon, m = Morning, e = Evening):");
        char letter = sc.next().charAt(0);

        switch (week) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                printTime(letter);
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid week number. Please enter 1-7.");
                break;
        }

        sc.close();
    }

    private static void printTime(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a':
                System.out.println("Afternoon");
                break;
            case 'm':
                System.out.println("Morning");
                break;
            case 'e':
                System.out.println("Evening");
                break;
            default:
                System.out.println("Unknown time option. Use 'a', 'm', or 'e'.");
                break;
        }
    }
}