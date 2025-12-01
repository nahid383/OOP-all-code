
import java.util.Scanner;

public class LeapYearorNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double year = sc.nextDouble();
        
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("This year is Leap Year.");
        } else{
            System.out.println("This year is not Leap Year.");
        }
    }
}