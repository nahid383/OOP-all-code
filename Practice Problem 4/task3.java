class wallett{
    private int balance;
    private  final int id;
    private static int counter = 1;

    public wallett() {
        this.id = counter++;
        this.balance = 0;
    }

    public wallett(int initialBalance){
        this.id = counter++;
        this.balance = initialBalance;
    }

    public void deposit(int amount){
        this.balance+=amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public int getBalance(){
        return this.balance;
    }

    public int getID(){
        return this.id;
    }
}

public class task3 {
    public static void main(String[] args) {
        wallett w1 = new wallett();
        wallett w2 = new wallett(200);
        wallett w3 = new wallett(600);

        w1.deposit(100);
        w2.withdraw(100);
        w3.deposit(400);

        System.out.println("Wallet " + w1.getID() + " Balance " + w1.getBalance());
        System.out.println("Wallet " + w2.getID() + " Balance " + w2.getBalance());
        System.out.println("Wallet " + w3.getID() + " Balance " + w3.getBalance());
    }
}
