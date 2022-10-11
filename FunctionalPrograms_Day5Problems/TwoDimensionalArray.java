/*2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.*/
package FunctionalPrograms_Day5Problems;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();

        //Methods calling
        int [][] a  =arrayInt(m,n);
        double [][] b  =arrayDouble(m,n);
        String [][] c  =arrayBoolean(m,n);
        display(a,b,c,m,n);
    }
    public static int[][] arrayInt(int m,int n)
    {
        int[][] a =new int[m][n];
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Integer Array");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    public static double[][] arrayDouble(int m,int n)
    {
        double[][] b =new double[m][n];
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Double Array");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                b[i][j] = sc.nextDouble();
            }
        }
        return b;
    }
    public static String[][] arrayBoolean(int m,int n)
    {
        String[][] c =new String[m][n];
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Boolean Array");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                c[i][j] = sc.next();
            }
        }
        return c;
    }

    //display method
    public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
    {
        PrintWriter pw=new PrintWriter(System.out,true);

        //Display integers
        System.out.println();
        pw.println("TWO DIMENSIONAL ARRAY INTEGER");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                pw.print("\t"+a[i][j]+" ");
            }
            pw.println("\t");
        }

        //Display double
        System.out.println();
        pw.println("TWO DIMENSIONAL ARRAY DOUBLE");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                pw.print("\t"+b[i][j]+" ");
            }
            pw.println("\t");
        }
        //Display boolean
        System.out.println();
        pw.println("TWO DIMENSIONAL ARRAY BOOLEAN");

        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                pw.print("\t"+c[i][j]+" ");
            }
            pw.println("\t");
        }
    }
}

