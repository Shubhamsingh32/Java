import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] deck1 = new int[a];
        int[] deck2 = new int[a];
        for (int i = 0; i < a; i++) {
            deck1[i] = scan.nextInt();
            deck2[i] = deck1[i];
        }
        for (int i = 0; i < a; i++) {
            System.out.print(deck1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            System.out.print(deck2[i] + " ");
        }
        
    }
}