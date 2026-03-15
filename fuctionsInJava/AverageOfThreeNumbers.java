import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void AverageNumber(int a , int b , int c){
        int sum = (a+b+c);
        float average = sum/3.0f;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the number : ");
        int b = sc.nextInt();

        System.out.print("Enter the number : ");
        int c = sc.nextInt();

        AverageNumber(a, b, c);
    }
}
