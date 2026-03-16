import java.util.Scanner;
public class arrayName{
    public static void main(String args []){
        
        // Scanner class created 
        Scanner sc = new Scanner (System.in);
        
        //displaying massage to user
        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();
        sc.nextLine();
        
        //Array creating 
        String [] name = new String[size];
        
        //input from user 
        for (int i = 0 ; i < size ; i++){
            System.out.print("Enter name " + (i+1) + " : ");
            name[i] = sc.nextLine();
        }
        
        //output
        for (int i = 0 ; i < name.length ; i++){
            System.out.println("Name " + (i+1) + " is : " + name[i]);
        }
        
    }
}