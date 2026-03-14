
import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = anand.nextInt();
        int reverse = 0;

        while(num!=0){
            int LastDigit = num%10;
            reverse = reverse * 10+LastDigit;
            num = num/10;

        }
        System.out.println(reverse);
    }
}
   