class Account{
    float money;
    public void deposit(float amount){
        money = money + amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(float amount){
        if(amount <= money){
            money = money - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    } 
}

public class bank {
    public static void main(String[] args){
        Account myAccount = new Account();
        myAccount.deposit(5000);
        myAccount.withdraw(2000);
        myAccount.withdraw(4000);
    }
}