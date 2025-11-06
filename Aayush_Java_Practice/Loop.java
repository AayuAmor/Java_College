package Aayush_Java_Practice;
import java.util.*;
public class Loop {
    public static void main(String[] args) {
      int  password = 12345;

    Scanner sc = new Scanner(System.in);
    boolean authenticated = false;

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter Your Password: ");
      int passwd = sc.nextInt();

      if (passwd == password) {
        System.out.println("Match vayo bro");
        authenticated = true;
        break;
      } else {
        int chancesLeft = 2 - i; // when i=0 -> 2 left, i=1 ->1 left, i=2 ->0 left
        if (chancesLeft > 0) {
          System.out.println("You have " + chancesLeft + " chance(s) left");
        } else {
          System.out.println("No chances left");
        }
      }
    }

    if (!authenticated) {
      System.out.println("Access denied.");
    }

    sc.close();


    }
}
