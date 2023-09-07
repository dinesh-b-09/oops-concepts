package encapsulation.main;

import encapsulation.kotak.BankAccount;
import encapsulation.kotak.SpecialBankAccount;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount(1, "Rajat", 1000, 25);

        //   System.out.println(b.balance); - o/p: 1000.0 - balance i have given int but compiler will upcast this too double

     //   b.balance -= 400; - i'm able to access this when balance is default in another class, so this is a flaw.
     //   System.out.println(b.balance); - o/p: 600.0

        System.out.println(b.toString()); // balance: 1000.0 , balance is upcasted from int to double

        b.credit(100);
        System.out.println(b.toString());  // balance: 1100.0

        b.debit(500);
        System.out.println(b.toString()); // balance: 600.0

        SpecialBankAccount sb = new SpecialBankAccount(2,"balu", 5000, 12,353839);
        System.out.println(sb.age); // age is public accessible everywhere
    }
}
