import java.util.Scanner;


public class concatenation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name : ");
        String name1 = sc.nextLine();

        System.out.print("Enter Your name : ");
        String name2 = sc.nextLine();

        String fullname = name1 + " " + name2;
        
        System.out.println(fullname);
    }
}