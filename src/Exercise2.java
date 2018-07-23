import java.util.Scanner;
public class Exercise2 {


    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanIn.nextInt();
        if(num == 0){
            System.out.println("Zero");
        }else if(num > 0){
            System.out.println("POSITIVE");

        }else if(num < 0){
            System.out.println("NEGATIVE");
        }

    }
}
