import java.util.Scanner;

public class PositiveNegativeZero {

    static int p = 0;
    static int n = 0;
    static int z = 0;

    public static void positiveNegativeZero(int num){

        if(num > 0){
            p++;
        }
        else if(num < 0){
            n++;
        }
        else{
            z++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            positiveNegativeZero(num);

            System.out.print("Continue (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + p);
        System.out.println("Negative numbers: " + n);
        System.out.println("Zeros: " + z);
    }
}