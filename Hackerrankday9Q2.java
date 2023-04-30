import java.util.Scanner;

public class Hackerrankday9Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        if (input >= 0) {
            int output = (int) input;
            System.out.println(output);
        } else {
            System.out.println("Invalid Input");
        }
    }
}