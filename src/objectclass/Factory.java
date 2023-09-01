package objectclass;

public class Factory
{


    public static void main(String[] args) {
        Keyboard k1 = new Keyboard("blue", "wire", true, true);
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



    }
}
