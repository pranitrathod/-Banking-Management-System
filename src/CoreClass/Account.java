package CoreClass;

public class Account {
    int accountId;
    int accountHolderName;
    int balance;
    String accountType;
    final int minBalance=1000;

    public int depositAmount(BankService bs,int amount)
    {
        balance+=amount;
        return balance;
    }
    int getWithdraw(){
        return 0;
    }
    public int getBalance(){
        return balance;
    }
    String getAccountType(){
        return accountType;
    }

    public int checkBalance()
    {
        return balance;
    }
    public int minbalance()
    {
        return minBalance;
    }
}
