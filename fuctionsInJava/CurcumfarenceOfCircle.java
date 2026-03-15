
import java.util.Scanner;


public class CurcumfarenceOfCircle{
    public static void curcumfarenceOfCircle(float  r) {
        float curcumfarence = 2*(3.1416f)*r;
        System.out.println(curcumfarence);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        float r = sc.nextFloat();

        curcumfarenceOfCircle(r);
        
    }
}