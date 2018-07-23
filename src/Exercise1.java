import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Press 1 ,2 ,3");
        int num = scanIn.nextInt();
        if(num == 1){
            System.out.println("Correct!");
        }else if(num == 2){
            System.out.println("Correct!");
        }else if(num == 3){
            System.out.println("Correct!");
        }else{
            System.out.println("ERROR!");
        }
    }
}
