import java.text.DecimalFormat;
import java.util.*;

public class Hackerrankday13Q2{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        double abstractAmount = scan.nextDouble();
        double interestRate =0.10;
        double totalAmount = abstractAmount * (1 + interestRate);
        double emi = totalAmount/12;
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(totalAmount));
        System.out.println(decimalFormat.format(emi));
        
    }
}