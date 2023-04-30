import java.io.*;
import java.util.*;

public class Hackerrankday20Q2 {
public static boolean isbigger(int e,int f){
    if(e>f){
        return true;
    }else{
        return false;
    }  
}
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        int e=scan.nextInt();
        int f=scan.nextInt();
      if(e>10 && f>10 && e<1000 && f<1000){ 
          if(isbigger(e,f)==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
      }else{
          System.out.println("Invalid Input");
      }
    }
}