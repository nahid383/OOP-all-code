import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        long marks = sc.nextLong();

        if(marks>=0 && marks<40){
            System.out.println("Failed!");
        } else if(marks>=40 && marks<60){
            System.out.println("You got C+");
        } else if(marks>=60 && marks<69){
            System.out.println("You got B");
        } else if(marks>=70 && marks<80){
            System.out.println("You got A-");
        } else if(marks>=80 && marks<89){
            System.out.println("You got A");
        } else{
            System.out.println("You got A+");
        }
    }
}
