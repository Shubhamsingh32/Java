import java.io.*;
import java.util.*;


class Hackerrankday18Q1
{
    public static void main(String[]args)
    {
        
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int arr[] = new int[a];
    for(int i = 0; i<a; i++)
    {
        arr[i] = sc.nextInt();
        
    }
    int total = 0;
    for(int number:arr)
    {
        total = total+number;
        
    }
    System.out.println(+total);
    }
}