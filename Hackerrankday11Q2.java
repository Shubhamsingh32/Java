import java.io.*;
import java.util.*;

public class Hackerrankday11Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=0)
        {
            for(int i=1;i<=a;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("&");
                }
                System.out.println(" ");
            }
        }
        else
        {
            System.out.print("Invalid Input");
        }
       
        
    }
}