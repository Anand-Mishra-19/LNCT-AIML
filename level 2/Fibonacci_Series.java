
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many number you want to fibonacci : ");
        int num = sc.nextInt();
        
        int First_num = 0;
        int Second_num = 1;

        System.out.println("Fibonacci series : ");


        for (int i = 1; i<=num; i++){
            System.out.print(First_num + " ");


            int next_num = First_num + Second_num;
            First_num = Second_num;
            Second_num = next_num;
        }
        sc.close();
        
    }
}
