package CoreClass;

import java.util.*;

public class BankService {

    HashMap<String,String> customerAccount=new HashMap<>();

    public HashMap<String,String> createAccount(String customerName,String customerAddress,int customerAge,String accountType,int balance)
    {
        customerAccount.put("customerName",customerName);
        customerAccount.put("customerAddress",customerAddress);
        customerAccount.put("customerAge",String.valueOf(customerAge));
        customerAccount.put("accountType",accountType);
        customerAccount.put("Balance",String.valueOf(balance));
        return customerAccount;
    }

    public String deposit(int amount) {

        return customerAccount.get("customerName")+" Deposited "+amount;
    }
    public String withdraw(BankService account,int amount) {
        Account acc=new Account();
        return  acc.getWithdraw(account,amount);
    }

    public int transfer(BankService fromCustomerName,BankService toCustomerName, int amount) {

//        fromCustomerName.withdraw(fromCustomerName,amount);
//        toCustomerName.deposit(amount);
//        CheckingAccount accountCheck=new CheckingAccount();

//        return accountCheck.getBalance();
        return 0;
    }

    public List customerDetails()
    {
        List<String> list=new ArrayList<>();
        list.add(customerAccount.get("customerName"));
        list.add(customerAccount.get("customerAddress"));
        list.add(customerAccount.get("customerAge"));
        list.add(customerAccount.get("accountType"));
        list.add(customerAccount.get("Balance"));
        return list;
    }



}
