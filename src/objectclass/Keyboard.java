package objectclass;

public class Keyboard
{
    String colour;
    String connectivity;
    boolean backlit;
    boolean mech;

     Keyboard(String colour, String connectivity, boolean backlit, boolean mech)
    {
        this.colour= colour;
        this.connectivity = connectivity;
        this.backlit = backlit;
        this.mech = mech;
    }

    Keyboard(String col, String connect, boolean isbacklit)
    {
        colour=col;
        connectivity=connect;
        backlit=isbacklit;
    }

//    void print()
//    {
//        System.out.println(colour);
//    }

    Keyboard(Keyboard x)
    {
        this.colour = x.colour;
        this.connectivity = x.connectivity;
        this.backlit = x.backlit;
        this.mech = x.mech;
    }



}
