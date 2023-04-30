import java.util.*;
import java.text.DecimalFormat;

class Hackerrankday14Q1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
            float balance = scan.nextFloat();
            int num = scan.nextInt();
            DecimalFormat xy = new DecimalFormat("#.00");
            switch(num)
            {
                case 1:
                float amtWithdrawl = scan.nextFloat();
                    if(amtWithdrawl>balance)
                    {
                        System.out.println("Error");
                    }
                    else{
                        balance = balance - amtWithdrawl;
                        System.out.println(xy.format(balance));
                    }
                    break;
                case 2:
                    float amtDeposited = scan.nextFloat();
                    balance = balance+amtDeposited;
                    System.out.println(xy.format(balance));
                    break;
                
                case 3:
                    System.out.println(xy.format(balance));
                    break;
                default:System.out.println("Error");
            }
    }
}