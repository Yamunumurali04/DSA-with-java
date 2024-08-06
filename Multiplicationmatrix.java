import java.util.Scanner;

class Multiplicationmatrix
{
    static void print(int a[][],int rowsize,int colsize)
    {
        for(int i=0;i<rowsize;i++)
        {
            for(int j=0;j<colsize;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void mutiply(int a[][],int row1,int cols1,int b[][],int row2,int cols2)
    {
        System.out.println("Frist matrix");
        print(a,row1,cols1);
        System.out.println("Second matrix");
        print(b,row2,cols2);

        if(row2 != cols1)
        {
            System.out.println("Multiplication of matrix is not possible");
        }
        else{
        int c[][] = new int[row1][cols2];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                for(int k=0;k<row2;k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Resultant matrix:");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rowsize of the frist matrix :");
        int row1 = sc.nextInt();
        System.out.println("Enter the colsize of the frist matrix :");
        int cols1 = sc.nextInt();
        int a[][] = new int[row1][cols1];
        System.out.println("Enter the elements of the frist matrix :");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the rowsize of the second matrix :");
        int row2 = sc.nextInt();
        System.out.println("Enter the colsize of the second matrix :");
        int cols2 = sc.nextInt();
        int b[][] = new int[row2][cols2];
        System.out.println("Enter the elements of the second matrix :");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        mutiply(a,row1,cols1,b,row2,cols2);
        sc.close();
    }
}