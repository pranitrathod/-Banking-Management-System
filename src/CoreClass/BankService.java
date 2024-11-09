package CoreClass;

import java.util.*;

public class BankService {

    HashMap<String,String> customerAccount=new HashMap<>();

    public HashMap<String,String> createAccount(String customerName,String customerAddress,int customerAge,String accountType)
    {
        customerAccount.put("customerName",customerName);
        customerAccount.put("customerAddress",customerAddress);
        customerAccount.put("customerAge",String.valueOf(customerAge));
        customerAccount.put("accountType",accountType);
        return customerAccount;
    }

    public String deposit(int amount) {

        return customerAccount.get("customerName")+" Deposited "+amount;
    }
    public int withdraw(int amount) {
        return amount;
    }

    public int transfer(String fromCustomerName, String toCustomerName, int amount) {
        CheckingAccount accountCheck=new CheckingAccount();
        return accountCheck.getBalance();
    }



}
