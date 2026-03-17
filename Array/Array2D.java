import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array size First is row second is column : ");

        int row = sc.nextInt();
        int column = sc.nextInt();

        int [][] matrix = new int[row][column];


        for (int i = 0 ; i<row ; i++ ){
            for (int j = 0 ; j< column ; j++){
                System.out.print("Enter element at [" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
             
        }
        
        for(int i = 0 ; i<row ; i++){
            for (int j = 0 ; j<column ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
