
import java.util.Scanner;

public class fuctions {
    public static void printMyName(String name , int age){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
    public static void Sum(int a , int b) {
        int num = a+b;
        System.out.println("Sum of 2 number " + num);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println();
        
        printMyName(name, age);
        Sum(a,b);
    }
}
