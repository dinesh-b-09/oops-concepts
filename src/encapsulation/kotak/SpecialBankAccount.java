package encapsulation.kotak;

public class SpecialBankAccount extends BankAccount
{
    int creditcardno;

    public SpecialBankAccount(int accountnumber, String accountname, double balance, int age, int creditcardno)
    {
        super(accountnumber, accountname, balance, age);
     //   this.accountnumber = 999; - accountno - protected - same package subclass "yes accessible"
        this.accountname = "apalsham kilkeeri";
        this.creditcardno = creditcardno;
    }



}
