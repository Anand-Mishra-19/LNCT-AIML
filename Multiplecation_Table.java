
import java.util.Scanner;

public class Multiplecation_Table {
    public static void main(String[] args) {
        
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = anand.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i +" = " + num*i);
        }
    }
}
