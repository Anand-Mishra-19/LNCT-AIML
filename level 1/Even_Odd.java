import java.util.Scanner;

public class Even_Odd {
    public static void main(String [] args){

        Scanner anand = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = anand.nextInt();

        if (num%2 == 0){
            System.out.println("Even "+ num);
        }
        else{
            System.out.println("Odd "+ num);
        }
    }
}
