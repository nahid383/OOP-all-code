
import java.util.Scanner;

public class calculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        for(long i=1; i<=20; i++){
            if(i%2==0){
                System.out.print(i+" ");
                if(i<19){
                    System.out.print("+ ");
                }
                sum+=i;
            }
        }
        System.out.println("Sum = "+sum);
        sum=0;
        for(long i=1; i<=20; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                if(i<19){
                    System.out.print("+ ");
                } 
                sum+=i;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
