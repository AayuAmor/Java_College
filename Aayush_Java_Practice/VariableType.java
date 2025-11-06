package Aayush_Java_Practice;
public class VariableType {
    int age;
    
    static int num1 = 98;
    void display(){ //Local variable
        String name = "hel";
        System.out.println("name = " + name + "Age = "+age + "Num = " +num1);
    }
    /*
    void display2(){
        System.out.println("Name" + name);
    }
    */
    public static void main(String[] args) {
        VariableType variableType = new VariableType();
        
        variableType.display();
        variableType.age = 67;
        VariableType.num1 = 2;

        variableType.display();
        VariableType variableType2 = new VariableType();
        variableType2.display();
        variableType2.age=7;
        VariableType.num1 =8;
        variableType2.display();
        
        System.out.println(VariableType.num1);
    }
}
