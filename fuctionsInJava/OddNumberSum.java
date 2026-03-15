
import java.util.Scanner;

public class OddNumberSum {
    public static void oddNumberSum (int n){
        int sum = 0;
        for (int i = 0 ; i <= n ; i++){
            int j = 0;
            if (i%2 != 0 ){
                sum =  sum + i;
            }
        }
        System.out.println(sum);
    }
        public static void main ( String [] args ){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            oddNumberSum(n);
        }
}
