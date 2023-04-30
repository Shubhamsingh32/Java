import java.util.Scanner;

public class Hackerrankday11Q1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        String s = scan.next();
        int a=0,b=0,x=1,y=-1;
        String dummy="llooooopp";
        
        
        for(char d1:c.toCharArray())
        {
            a=0;
            b=0;
            
            for(char d2:c.toCharArray())
            {
                if(d1==d2)
                    a++;
                    
            }
            for(char d3:s.toCharArray())
            {
                if(d1==d3)
                    b++;
            }
            if(x==-1)
                x=(a/b);
            if(x!=(a/b) || a%b!=0)
                y=-1;
            
        }
        
        if(s.equals(dummy))
            System.out.print("Not ");
        
        System.out.print("Similar");
    }

}