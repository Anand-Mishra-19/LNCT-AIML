
import java.util.Scanner;

public class GCD_of_two_numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        int GCD = 1;

        for (int i = 1; i <= num1 && i <= num2; i++){
            if (num1 % i == 0 && num2 % i == 0){
                GCD = i;
            }
        }
        System.out.println(GCD);


    }
}
