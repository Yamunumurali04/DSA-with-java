import java.util.Scanner;

public class Addition {
    // printing the matrix
    static void matrix(int a[][],int rowsize,int colsize)
    {
        for(int i =0 ; i< rowsize;i++)
        {
            for(int j=0;j< colsize;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Addition of two matrices
    static int[][] add(int size,int a[][],int b[][])
    {
        int c[][] = new int[size][size];
        for(int i =0 ; i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                c[i][j] = a[i][j]+ b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
    int a[][];
    int b[][];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row size of the matrix:");
    int rowsize = sc.nextInt();
    System.out.println("Enter the column size of the matrix: ");
    int colsize = sc.nextInt();
    // Checking the condition rowsize is equal to the columnsize
    if(rowsize != colsize)
    {
        System.out.println("Addition is performed");
    }
    else{
        a = new int[rowsize][colsize];
        b = new int[rowsize][colsize];
        System.out.println("Element in the frist matrix: ");
        for(int i =0 ; i<rowsize;i++)
        {
            for(int j=0;j<colsize;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        matrix(a,rowsize,colsize);
        System.out.println("Element in the second matrix: ");
        for(int i =0 ; i<rowsize;i++)
        {
            for(int j=0;j<colsize;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        matrix(b,rowsize,colsize);
        int c[][] = add(rowsize, a, b);
        System.out.println("Resultant matrix:");
        for(int i =0 ; i<rowsize;i++)
        {
            for(int j=0;j<colsize;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    sc.close();
    } 
}
