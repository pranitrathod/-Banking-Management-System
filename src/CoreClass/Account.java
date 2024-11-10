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
    String getWithdraw(BankService custDetails,int amount){
        int currentBalance = Integer.parseInt(custDetails.customerAccount.get("Balance"));
        if(currentBalance>amount){
            int leftBalance=Integer.parseInt(custDetails.customerAccount.get("Balance"))-amount;
            if(leftBalance<currentBalance){
                custDetails.customerAccount.put("Balance",String.valueOf(leftBalance));
                return "Customer "+ custDetails.customerAccount.get("customerName")+" Balance Left "+String.valueOf(leftBalance);
            }}
        return "Insufficient Balance for this customer";
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
