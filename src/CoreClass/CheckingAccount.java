package CoreClass;

public class CheckingAccount extends Account{

    Account acc=new Account();

//    public int depositAmount()
//    {
//        return 1500;
//    }
@Override
public int depositAmount(int amount)
{   super.depositAmount(amount);
    return amount;
}
@Override
    public int checkBalance()
{
    return getBalance();
}



}
