import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        long num = sc.nextLong();

        if(num%2==0){
            System.out.println("This is an Even Number");
        } else{
            System.out.println("This is an Odd Number");
        }
    }
}
