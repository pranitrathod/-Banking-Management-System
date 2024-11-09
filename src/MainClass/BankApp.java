package MainClass;

import CoreClass.Account;
import CoreClass.BankService;
import CoreClass.CheckingAccount;
import CoreClass.SavingsAccount;

public class BankApp {
    public static void main(String[] args) {
        Account acc1=new SavingsAccount();
        Account acc2=new CheckingAccount();
//        System.out.println("Minimum Balance Should be "+acc1.minbalance());
//        System.out.println("Your Deposit Amount is "+acc2.depositAmount(500));
//        System.out.println("Your Balance is "+acc2.checkBalance());
//        System.out.println("Your Deposit Amount is "+acc2.depositAmount(500));
//        System.out.println("Your Balance is "+acc2.checkBalance());
//        System.out.println("Your Deposit Amount is "+acc2.depositAmount(1500));
//        System.out.println("Your Balance is "+acc2.checkBalance());
        BankService bs=new BankService();
        bs.createAccount("Pranit Rathod","Tirupati Supreme Enclaves",24,"current");
        System.out.println(bs.deposit(1500));
        BankService bs2=new BankService();
        bs2.createAccount("Piyu Rathod","Tirupati Supreme Enclaves",30,"saving");
        System.out.println(bs2.deposit(1000));
    }


}
