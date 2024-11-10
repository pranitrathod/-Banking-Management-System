package MainClass;

import CoreClass.Account;
import CoreClass.BankService;
import CoreClass.CheckingAccount;
import CoreClass.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

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
        bs.createAccount("Pranit Rathod","Tirupati Supreme Enclaves",24,"current",1500);
        System.out.println(bs.deposit(1500));
        BankService bs2=new BankService();
        bs2.createAccount("Piyu Rathod","Tirupati Supreme Enclaves",30,"saving",1000);
        System.out.println(bs2.deposit(1000));

        List<List<String>> customerDetails =new ArrayList<List<String>>();
        customerDetails.add(bs.customerDetails());//customer1 Data
        customerDetails.add(bs2.customerDetails());//customer2 Data

//        bs.withdraw(bs,500) ;
        for (List<String> st:customerDetails) {
            System.out.println(st);
        }
        System.out.println(bs.withdraw(bs,500));
        System.out.println(bs2.withdraw(bs2,1500));
    }

}


//Bank Service will give us Account details
//Withdraw,Deposits
//Transfer