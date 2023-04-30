import java.io.*;
import java.util.*;

public class Hackerrankday19Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        double arr[][] = new double[row][];
        
        
        for(int i=0;i<row;i++){
            
            int col = sc.nextInt();
            arr[i] = new double[col];
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextDouble();
            }
            
        }
        
        int nu = sc.nextInt();
        double su = 0;
        for(int i=0;i<arr[nu-1].length;i++){
            su = su+ arr[nu-1][i];
        }
        
        
        double a = su/arr[nu-1].length;
        System.out.print("Average in Subject-"+nu+" is "+ a);
        
        
        
        
    }
}