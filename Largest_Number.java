import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the numbers : ");

        int a =anand.nextInt();
        System.out.print("Enter the numbers : ");

        int b =anand.nextInt();
        System.out.print("Enter the numbers : ");

        int c =anand.nextInt();
        
        if (a>b && a>c){
            System.out.println("A is the largest number : " + a);
        }
        else if(b>a && b>c){
            System.out.println("B is the largest number : " + b);
        }
        else{
            System.out.println("C is the largest number : " + c);
        }
    }
}
