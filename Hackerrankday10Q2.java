import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Hackerrankday10Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double borrowed_amount = sc.nextDouble();
        double interest_rate = 0.10;
        double total_amount = borrowed_amount * (1+interest_rate);
        double EMI = total_amount /12;
         
        DecimalFormat decimalFormat = new DecimalFormat ("#.##");
        
        System.out.println(decimalFormat.format(total_amount));
        System.out.println(decimalFormat.format(EMI));
    }
}