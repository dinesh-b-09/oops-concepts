package encapsulation.kotak;

public class BankAccount
{
    protected int accountnumber;
    String accountname;  //default
    private double balance;

    public int age;

    public BankAccount(int accountnumber, String accountname, double balance, int age) {
        this.accountnumber = accountnumber;
        this.accountname = accountname;
        this.balance = balance;
        this.age = age;
    }

    public void credit(double var)
    {
        this.balance += var;
    }

    public void debit(double var)
    {
        this.balance -= var;
    }

    @Override
    public String toString()    // overriding from object class
    {
        return "Account number is: " + this.accountnumber + ", name: " + this.accountname + ", balance is: " + this.balance+" age: "+this.age;
    }


}
