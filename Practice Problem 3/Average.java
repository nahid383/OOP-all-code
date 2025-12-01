
import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        double arr[] = new  double[n];

        double sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextDouble();
            sum+=arr[i];
        }

        double avg = sum/n;

        System.out.println("Average of all the numbers: "+avg);
    }
}