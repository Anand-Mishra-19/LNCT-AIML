
import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = anand.nextInt();

        int count = 0;

        while(num !=0){
            num = num/10;
            count++;

        }
        System.out.println(count);
    }
}
