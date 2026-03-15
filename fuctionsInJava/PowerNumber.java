
import java.util.Scanner;

public class PowerNumber {

    public static void powerNumber(int x , int n){

        int sum = 1;

        for (int i = 1; i <= n; i++){
            sum = sum*x;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x= sc.nextInt();

        System.out.print("Enter the value of N : ");
        int n= sc.nextInt();

        powerNumber(x, n);

    }
}
