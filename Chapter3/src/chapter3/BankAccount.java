package chapter3;

/**
 *
 * @author Gerardo A A
 */
public class BankAccount {
    private Integer account_number;
    private String owner;
    private Double balance;

    public BankAccount(Integer account_number, String owner, Double balance) {
        this.account_number = account_number;
        this.owner = owner;
        this.balance = balance;
    }
    
    public BankAccount(){
        this.account_number = 9999;
        this.owner = "Unkonown";
        this.balance = 0.0;
    }
    
    public void deductMothlyFee(){
        this.balance-=4.0;
    }
    
    public void explainAccountPolicy(){
        System.out.println("The $4 service fee will be deducted each month");
    }

    public Integer getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Integer account_number) {
        this.account_number = account_number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public void showInfo(){
        System.out.println("------------------");
        System.out.println(getAccount_number());
        System.out.println(getOwner());
        System.out.println(getBalance());
    }
    
    
}
