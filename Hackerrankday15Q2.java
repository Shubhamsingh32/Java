import java.util.Scanner;
class Hackerrankday15Q2{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number>=1 && number<=10){
            int total=0;
            int mark;
            for(int i=0;i<number;i++){
                mark=scan.nextInt();
                if(mark<100 && mark>=0)
                total = total+mark;
            }
            System.out.print(total);
        }
        else{
            System.out.print("Invalid");
        }
    }
}