import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        int size=scan.nextInt();
        
        if(size<0)
        {
            System.out.println("Invalid Array Size");
            System.exit(0);
        }
        
        else{
            double arr[]=new double[size];
        for(int i=0;i<size;i++)
        {
            double input=scan.nextDouble();
            if(input>=0)
            {
                arr[i]=input;
            }
            else{
                count=1;
            }
        }
     
        if(count==1)
        {
            System.out.println("Invalid Array Elements");
        }
            else{
                   for(int a=0;a<size;a++){
            System.out.println((int)arr[a]);
        }
            }
        }
        
    }
}