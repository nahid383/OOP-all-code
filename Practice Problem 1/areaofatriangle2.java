
import java.util.Scanner;

public class areaofatriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first arm: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second arm: ");
        double b = sc.nextDouble();
        System.out.println("Enter the third arm: ");
        double c = sc.nextDouble();

        double s = (a+b+c)/3;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.err.println("Area of the triangle : "+area);

        

    }
}
