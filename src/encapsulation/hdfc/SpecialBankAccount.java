package encapsulation.hdfc;

import encapsulation.kotak.BankAccount;

public class SpecialBankAccount extends BankAccount
{
    int creditcardno;

    public SpecialBankAccount(int accountnumber, String accountname, double balance, int age, int creditcardno)
    {
        super(accountnumber, accountname, balance, age);
        this.accountnumber = 999; // - accountno - protected -diff package subclass "yes accessible"
        this.creditcardno = creditcardno;
    }
}
