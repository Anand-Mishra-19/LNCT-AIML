
import java.util.Scanner;

public class AgeForVoting {
    public static void ageForVoting(int age){
        if (age>= 18){
            System.out.println("You are eligible for Voting : ");
        }
        else{
            System.out.println("Not eligible for Voting : ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        ageForVoting(age);
        
    }
}
