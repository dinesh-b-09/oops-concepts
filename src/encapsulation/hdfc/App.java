package encapsulation.hdfc;

import encapsulation.kotak.BankAccount;

public class App
{

    public void editacc()
    {
        BankAccount b1 = new BankAccount(777, "ravi" ,600, 34);
    //    b1.accountnumber = 657; //  accountno - protected - diff package non-subclass "not accessible"

     //   b1.accountname = "Joey"; // accountname is default so "not accessibe" in any other package

    }




}
