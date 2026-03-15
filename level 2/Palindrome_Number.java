
import java.util.Scanner;

public class Palindrome_Number {
    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int reverse = 0;

        int number = num;

        while(num != 0){
            int lastDigit = num%10;
            reverse = reverse * 10 + lastDigit;
            num = num /10;
        }
        if (number ==  reverse){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
