package objectclass;

public class Main
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(5,10);
        Complex c2 = new Complex(6,14);

       c1.print();
       c2.print();

       c1.add(c2);  // c1 becomes 11 + 24i

       c1.print();
       c2.print();  //c2 will be 6 + 14i;

       c2.sub(c1);

        c1.print();
        c2.print();  //c2 becomes -5 + -10i

         Complex c3= new Complex(c1);


    }
}
