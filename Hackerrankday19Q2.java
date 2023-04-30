import java.io.*;
import java.util.*;

public class Hackerrankday19Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String stra[] = new String[4];
        String strb[] = new String[4];
        for(int i=0;i<4;i++){
            stra[i] = sc.next();
        }
        for(int i=0;i<4;i++){
            strb[i] = sc.next();
        }
        int cnt=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(stra[i].equals(strb[j])){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
        
        
    }
}