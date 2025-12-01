
import java.util.Scanner;

public class positiveorNegative {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        long num = sc.nextLong();

        if(num>0){
            System.out.println("Positive Integer");
        } else{
            System.out.println("Negative Integer");
        }
    }
}
