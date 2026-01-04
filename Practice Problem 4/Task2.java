
import java.util.Scanner;
class wallet{
    private int balance;

    wallet(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public int finalBalance(){
        return this.balance;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        wallet wallet1 = new wallet(2300);
        wallet wallet2 = new wallet(1200);


        wallet1.deposit(400);
        wallet1.withdraw(700);

        wallet2.deposit(900);
        wallet2.withdraw(200);

        System.out .println("final balance on wallet1 : "+wallet1.finalBalance());
        System.out.println("final balance on wallet2 : "+wallet2.finalBalance());
    }
    
}
