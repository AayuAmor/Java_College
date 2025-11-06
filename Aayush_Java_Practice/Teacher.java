package Aayush_Java_Practice;
public class Teacher {
    String name;
    int age;
    
    void display(){
        System.out.println("Name = " + name + "\nAge = " + age);
    }

    public static void main(String[] args) {
        Teacher info = new Teacher();
        info.name="Aayush";
        info.age=22;
        info.display();
    }
}
