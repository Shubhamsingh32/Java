import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Hackerrankday17Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int flag=0;
        
        if(size<0)
        {
            System.out.println("Invalid Array Size");
            System.exit(0);
        }

        else{
            int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            int input=sc.nextInt();
            if(input>=0)
            {
            arr[i]=input;     
            }
            else{
                flag=1;
                break;
            }
        }
        
            if(flag==1)
            {         
        System.out.println("Invalid Array Elements");
        }
        else{
             Arrays.sort(arr);
        System.out.println(arr[size-2]);
        }
        }
        
    }
    }
