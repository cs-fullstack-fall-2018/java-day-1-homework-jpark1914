import java.util.Scanner;
public class Exercise3 {


    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Pick 3 numbers under '12'!");
        int num = scanIn.nextInt();
        int num2 = scanIn.nextInt();
        int num3 = scanIn.nextInt();
        int finalNum = num+num2+num3;
        if(finalNum == 21){
            System.out.println("BlackJack!");
        } else if(finalNum < 21){
            System.out.println("The total is: " + finalNum);
        }else if(finalNum > 21){
            System.out.println("Bust");
        }
    }
}
