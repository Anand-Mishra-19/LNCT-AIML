
import java.util.Scanner;

public class FibonacciSeries {

    public static void fibonacciSeries(int a , int b , int num) {
        int nextnumber = 0;
        for (int i = 1 ; i <= num ; i++){
           nextnumber  = a + b;
           System.out.print(nextnumber + " ");
           a = b;
           b = nextnumber;
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how much number you need of fibonacci series  : ");
        int num = sc.nextInt();

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Here is the fabonacci series : ");

        fibonacciSeries(a , b , num);
    }
}
