import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B= sc.nextInt();
        int Result = (A*4 + B*6);
        System.out.println(Result);
    }
}