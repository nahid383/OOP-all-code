import java.util.Scanner;

public class TriangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = sc.nextDouble();

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        double area = .5 * height * base;

        System.out.println("Area of the triangle = " + area);
    }
}
