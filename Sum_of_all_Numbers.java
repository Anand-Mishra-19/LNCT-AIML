import java.util.Scanner;

public class Sum_of_all_Numbers {
    public static void main(String[] args) {
        
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = anand.nextInt();

        int sum = 0;

    for (int i = 1; i<=num; i++){

        sum = sum+i;
    }
    System.out.println("Sum of the " + num + " = " + sum);
    }
    
}
