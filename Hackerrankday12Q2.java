import java.io.*;
import java.util.*;

public class Hackerrankday12Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int choice=scan.nextInt();
        if(num>0 && (choice>=1 && choice<=4))
        {
            
        if(choice==1)
        {
            if(num%2==0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("NO");
            }
        }
        else if(choice==2)
        {
            if(num%2!=0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("NO");
            }
        }
        else if(choice==3)
        {
            int a=num/2,count=0;
            if(num==0||num==1)
            {
                System.out.println("NO");
            }
            else{
                for(int i=2;i<=a;i++)
                {
                    if(num%i==0)
                    {
                        System.out.println("NO");
                        count=1;
                        break;
                    }
                }
                if(count==0)
                {
                    System.out.println("Yes");
                }
            }
        }
        else{
            int factorial=1;
            for(int i=num;i>0;i--)
            {
                factorial=factorial*i;
            }
            System.out.println(factorial);
        }
        }
    }
}