package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok",12345567);


        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(100);

        account1.checkBalance();

        System.out.println("------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun",231563563);

        account2.deposit(10000);
        account2.checkBalance();

    }

}
