package chapter3;

import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class TestBankAccount {
    public static BankAccount getData(){
        BankAccount banco = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("No. de cuenta:");
        banco.setAccount_number(scanner.nextInt());
        System.out.println("Dueño de la cuenta:");
        banco.setOwner(scanner.next());
        System.out.println("Balance:");
        banco.setBalance(scanner.nextDouble());
        return banco;
    }
}
