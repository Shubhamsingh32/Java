import java.io.*;
import java.util.*;

public class Hackerrankday16Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n>0 && n<=5)
        {
            while(n!=0)
            {
                int a = 7;
                int result = 0;
                for(int i = 0;i<a;i++)
                {
                    int number = scan.nextInt();
                    result = result+number;
                }
                if(result == 56)
                {
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                n--;
            }
        }
    }
}