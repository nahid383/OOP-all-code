
import java.util.Scanner;

public class Task1 {
    static int deposit(int balance, int amount){
        return balance+amount;
    }

    static int withdraw(int balance, int amount){
        return balance-amount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int balance_1 = 0;

        int balance_1 = sc.nextInt();
        int balance_2 = sc.nextInt();

        balance_1 = deposit(balance_1, 400);
        balance_1 = withdraw(balance_1, 250);

        
        balance_2 = deposit(balance_2, 400);
        balance_2 = withdraw(balance_2, 250);

        System.out.println("Final balance on wallet 1: "+balance_1);
        System.out.println("Final balance on wallet 2: "+balance_2);

    }
}
