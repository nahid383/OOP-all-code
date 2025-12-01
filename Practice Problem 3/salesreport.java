import java.util.Scanner;

public class salesreport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your reached sales of target and attendance of your work: ");
        double reach = sc.nextDouble();
        double attend = sc.nextDouble();
        if(reach>=95 && attend==100){
            System.out.println("You Got 60% bonus.");
        } else if(reach>=95 && attend>=90){
            System.out.println("You Got 40% bonus.");
        } else if(reach>=80 && attend==100){
            System.out.println("You Got 40% bonus.");
        } else if(reach>=80 && attend==90){
            System.out.println("You Got 20% bonus.");
        } else{
            System.out.println("You Got 5% bonus.");
        }
    }
}
