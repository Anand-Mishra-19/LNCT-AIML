
import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = anand.nextInt();

        if (num == 0 ){
            System.out.println("Zero");
        }
        else if(num > 0 ){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
