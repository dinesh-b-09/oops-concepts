package objectclass;

public class Factory
{


    public static void main(String[] args) {
        Keyboard k1 = new Keyboard("blue", "wire");
        Keyboard k2 = new Keyboard("red", "wireless", true);

        Keyboard k3= k1;

        Keyboard k4= new Keyboard(k1);

        System.out.println(k1.colour);
        System.out.println(k2.colour);
        System.out.println(k3.colour);
        System.out.println(k4.colour);

        System.out.println();
        k1.colour="yellow";

        System.out.println(k1.colour);
        System.out.println(k3.colour);
        System.out.println(k4.colour);

        Keyboard k5= new Keyboard("magenta","wire",true,true);
        System.out.println(k5.colour);
         Keyboard.printsomething();
         k5.printanything();

    }
}
