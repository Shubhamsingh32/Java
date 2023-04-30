import java.util.*;
public class pyramid
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float n=scan.nextFloat();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}