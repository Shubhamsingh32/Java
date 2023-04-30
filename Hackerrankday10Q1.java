import java.io.*;
import java.util.*;

public class Hackerrankday10Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s;
        char c;
        s = sc.nextLine();
        s = s.trim();
        c = sc.next().charAt(0);
        int l = s.length();
        int b = 0;
        for(int i = 0; i < l;i++)
        {
            char x =s.charAt(i);
            if(x==c)
            {
                b++;
            }
        }
        System.out.println(b);
        
    }
}