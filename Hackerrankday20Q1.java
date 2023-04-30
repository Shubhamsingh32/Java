import java.io.*;
import java.util.*;

public class Hackerrankday20Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>0 && n<8)
        {
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int result=0;
        for(int j=0;j<n;j++)
        {
            result+=arr[j];
        }
        float percentage=result/n;
        String grade;
        if(percentage>90)
        {
            grade="A+";
        }
        else if((percentage>=70) && (percentage<=89))
        {
            grade="A";
        }
         else if((percentage>=60) && (percentage<=69))
        {
            grade="B";
        }
         else if((percentage>=50) && (percentage<=59))
        {
            grade="C";
        }
        else{
            grade="D";
        }
        System.out.println(grade);
        }
        else{
            System.out.println("Invalid");
        }
    }
}