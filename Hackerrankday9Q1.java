import java.util.Scanner;

public class Hackerrankday9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        int aInt = (int) Math.ceil(a);
        int bInt = (int) Math.ceil(b);
        int cInt = (int) Math.ceil(c);
        System.out.println(aInt + " " + bInt + " " + cInt);
    }
}