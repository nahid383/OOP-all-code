
import java.util.Scanner;

public class Conversion_C_to_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter temperatur in Farenhit: ");;
        double celcius  = sc.nextDouble();

        double Farenhite = (celcius/5)*9+32;

        System.out.println("In farenhite scale: " + Farenhite);
    }
}
