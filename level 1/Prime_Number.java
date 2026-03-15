
import java.util.Scanner;

public class Prime_Number {
    public static void main (String [] args){
        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the nubmer : ");
        int num = anand.nextInt();
        boolean kypta = true;

        if (num <= 1){
            kypta = false;
        }

        for (int i = 2 ; i < num ; i++){
            if (num % i ==0 ) {
                kypta = false;
                break;
            }
        }
        if (kypta == true){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }

    }
}

