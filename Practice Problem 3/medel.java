
import java.util.Scanner;

public class medel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Students Letter Grade(CGPA): ");
        double grade = sc.nextDouble();

        System.out.print("Has the student completed his semester?(yes/ no)");
        String completed = sc.next();
        if(grade>=3.5){
            if(completed.equalsIgnoreCase("yes")){
                System.out.println("The student will get a medel.");
            } else{
                System.out.println("The student will not get a medel.");
            }
        } else{
            System.out.println("The student will not get a medel.");
        }
    }    
}
