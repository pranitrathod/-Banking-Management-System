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
        balance-=amount;//this will be from account class
    return amount;
    }

    public int transfer(BankService fromCustomerName,BankService toCustomerName, int amount) {

        fromCustomerName.withdraw(amount);
        toCustomerName.deposit(amount);
        CheckingAccount accountCheck=new CheckingAccount();

        return accountCheck.getBalance();
    }

    public List customerDetails()
    {
        List<String> list=new ArrayList<>();
        list.add(customerAccount.get("customerName"));
        list.add(customerAccount.get("customerAddress"));
        list.add(customerAccount.get("customerAge"));
        list.add(customerAccount.get("accountType"));
        return list;
    }



}
