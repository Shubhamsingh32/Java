import java.io.*;
import java.util.*;

public class HackerrankdayQ1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x,y;
        Scanner sc=new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>0 && y>0)
        {
            System.out.println(x+"-"+y);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
    
}