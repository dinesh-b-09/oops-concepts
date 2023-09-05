package wrapperclasses;

public class Autoboxing
{
    public static void main(String[] args)
    {

        // autoboxing is primitive data type to object

        int a=10;
        double b=30;
        String s= "3000";

        String q="12456"; // it wont take
        System.out.println(Integer.parseInt(q)); // character will not be converted and throw numberformat exception

        Integer z=a;

        Integer x= Integer.parseInt(s);

        System.out.println(z);
        System.out.println(x);

        String str= z.toString();
        System.out.println(str);
    }
}
