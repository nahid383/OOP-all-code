
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Which operation you want to do: (+, -, *, /, %)");
        char nh = sc.next().charAt(0);
        if(nh=='+'){
            double sum = num1+num2;
            System.out.println("Sum = "+sum);
        } else if(nh=='-'){
            double sub = num1-num2;
            System.out.println("Subtraction = "+sub);
        } else if(nh=='*'){
            double mul = num1*num2;
            System.out.println("Multiplication = "+mul);
        } else if(nh=='/'){
            double div = num1/num2;
            System.out.println("Divided = "+div);
        } else if(nh=='%'){
            double mod = num1%num2;
            System.out.println("Modulus = "+mod);
        }
    }
    

}
