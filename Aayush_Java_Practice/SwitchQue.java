package Aayush_Java_Practice;
import java.util.Scanner;
public class SwitchQue {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your grade :");
        char grade = inp.nextLine().charAt(0);
        inp.nextLine();
        System.out.println("Enter your marks");
        int marks = inp.nextInt();

        switch (grade){
            case 'A':
                System.out.println("You got grade A");
                switch (marks/10){
                    case 9:
                    case 10:
                        System.out.println("Excellent performance");
                        break;
                    default:
                    System.out.println("Good but can imporve");
                        break;
                }
                break;
            case 'B':
                System.out.println("you got Grade B");
                switch(marks/10){
                    case 7:

                }
                break;
        }



    }
}