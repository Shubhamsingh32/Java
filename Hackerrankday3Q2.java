import java.io.*;
import java.util.*;
public class Solution

{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int Count = 0;
        for (int i = 0; i<num; i++)
        {
            if (num == i * i * i ){
                Count++;
            }
        }
        if( Count  == 1)
        {
            System.out.println("Perfect Cube");

        }
        else{
            System.out.println("Not Perfect Cube");

        }
    }
}