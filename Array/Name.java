import java.util.Scanner;
public class Name {
    public static void printName (String name[]){
        for(int i = 0; i < name.length ; i++){
            System.out.println(name[i]);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name[] = new String[3];

        for (int i = 0; i < name.length; i++){
            System.out.print("Enter the name : ");
            name[i] = sc.nextLine();
        }

        printName(name);
    }
}

    