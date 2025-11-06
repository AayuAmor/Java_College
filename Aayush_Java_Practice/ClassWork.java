package Aayush_Java_Practice;
import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        int password=12345;
        String username= "new";
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String  name = sc.nextLine();

        System.out.println("Enter Your Password:");
        int passwd = sc.nextInt();

        if (name.equals(username) && passwd == password){
            System.out.println("Matched !!!");
        }
        else if (name.equals(username) | passwd == password) {
            if (name.equals(username)){
                System.out.println("Name matched bro !!!!!");
            }
            else{
                System.out.println("Password Matched bro ^_^");
            }
            
        }
        else{
            System.out.println("none matched !");
        }


    }
}
