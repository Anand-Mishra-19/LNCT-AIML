
import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int number = num;
        int LastDigit ;
        int sum = 0;

        while(num!=0){
            LastDigit = num%10;
            sum = sum+(LastDigit * LastDigit * LastDigit);
            num = num/10;
        }
        if (number == sum){
            System.out.println("Armstrong number : " + number);
        }
        else{
            System.out.println("Not armstrong number : " + number);
        }
    }
}
