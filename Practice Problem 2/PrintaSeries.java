
import java.util.Scanner;

public class PrintaSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(long i=1; i<=20; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        for(long i=1; i<=20; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
