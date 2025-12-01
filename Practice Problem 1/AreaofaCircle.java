
import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of a circle: ");
        double radius = sc.nextDouble();
        final double PI = 3.1416f;

        double area = PI * radius*radius;

        System.out.println("Area of the circle: "+area);
    }
 
}
