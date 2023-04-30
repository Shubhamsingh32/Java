import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackerrankday5Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int total=0;
        int n=0;
        while(a>0){
            int temp=a%10;
            total+= temp*Math.pow(2, n);
            a=a/10;
            n++;
        }
        if(total>=65 && total<=90){
            System.out.println((char)total);
        }
        else{
            System.out.println("INVALID PAPER CODE");
        }
        
    }
}