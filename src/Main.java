

class A
{
    int a=10;
    void show()
    {
        System.out.println("class A");
    }
}

class B extends A
{
    int a=20;

   void show()
   {
       System.out.println(super.a);
       super.show();
   }



}

public class Main
{
    public static void main(String[] args)
    {
        A obj1 = new B();
        obj1.show();
    }
}