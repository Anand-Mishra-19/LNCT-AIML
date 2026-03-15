
import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void greatestOfTwoNumbers(int a , int b){
        if(a>b){
            System.out.println("A is the Greatest number : " + a);
        }else{
            System.out.println("B is the greatest number : " + b);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number : ");
        int a = sc.nextInt();

        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();

        greatestOfTwoNumbers(a, b);

    }
}
