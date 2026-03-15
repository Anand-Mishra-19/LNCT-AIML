
import java.util.Scanner;

public class factorial_num {
    public static void main(String[] args) {
        
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = anand.nextInt();
        int factorial = 1;

        for (int i = 1; i<=num; i++){
            factorial = factorial*i;
        }
        System.out.println("factorial of given input was : "+ factorial);
    }
}
