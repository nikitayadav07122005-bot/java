import java.util. Scanner;   // package
public class conditions {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
//  Scanner-class name, sc-object name,new- Create an object of a class,(System.in)-Input coming from keyboard, scanner- constructor call.
int age= sc.nextInt();
//nextInt()-It tells Scanner“ -Read an integer value from the keyboard.” , This line is used to take an integer input from the user and store it in a variable.

if (age>18){
    System.out.println("'adult");
}else{
    System.out.println("not adult");
}
}
}
