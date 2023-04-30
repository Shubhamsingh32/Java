import java.io.*;
import java.util.*;
enum Days
{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;
}
class Hackerrankday18Q2
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("Monday") || str.equals("Tuesday") || str.equals("Wednesday") || str.equals("Thursday") || str.equals("Friday") || str.equals("Saturday"))
        {
            Days days = Days.valueOf(str);
        
        switch(days)
        {
            case Monday:
                {
                System.out.println("8:30 5:30");
                break;}
            case Tuesday:{
                System.out.println("8:30 5:30");
                break;}
            case Wednesday:{
                System.out.println("8:30 5:30");
                break;}       
            case Thursday:{
                System.out.println("8:30 5:30");
                break;}
            case Friday:{
                System.out.println("8:30 5:30");
                break;}              
            case Saturday:{
                System.out.println("9:30 4:30");
                break;}
            
        }
        }
            else
            {
                System.out.println("Library is closed");
            }
        
    }
}