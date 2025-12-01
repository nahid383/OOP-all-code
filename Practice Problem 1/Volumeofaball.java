import java.util.Scanner;

public class Volumeofaball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();
        final double PI = 3.1416f;
        double volume = (4.0/3.0) * PI * Math.pow(radius,3);

        System.out.println("Volume of a ball "+volume);
    }
}
