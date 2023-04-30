import java.util.*;
public class Solution
{
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    if(b<100 && b>=0)
    {
        for(int i = 0; i<=b; i++)
        {
            System.out.println(i);
        }
        System.out.println("Games End");
    }
    else
    {
        System.out.println("Invalid Input");
    }
  }
}