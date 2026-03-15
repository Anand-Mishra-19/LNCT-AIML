import java.util.Scanner;

public class GCD {

    public static void gcdOfTwoNumber(int a , int b){
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++){
            if (a%i == 0 && b%i == 0 ){
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        gcdOfTwoNumber(a, b);
    }
}
