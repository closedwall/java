import java.util.Scanner;
//program to implement transpose of matrix
public class thirtyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] matrix = new int [row][col];
        int [][] trans = new int [col][row];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int temp = sc.nextInt();
                matrix[i][j]=temp;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose(i,j,matrix,trans);
            }
        }

        System.out.println("sum of Given Matrices is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static void transpose(int row, int col, int[][] matrix, int[][] trans) {
        trans[row][col]=matrix[col][row];
    }
}
