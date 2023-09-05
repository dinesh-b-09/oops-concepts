package objectclass;

public class Keyboard
{
    String colour;
    String connectivity;
    boolean backlit;
    boolean mech;

    static int x=1000;

     Keyboard(String colour, String connectivity)
    {
        this.colour= colour;
        this.connectivity = connectivity;
    }

    Keyboard(String colour, String connectivity, boolean backlit, boolean mech)
    {
        this(colour,connectivity);
        this.backlit=backlit;
        this.mech=mech;

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

    static void printsomething()
    {
        System.out.println(x);
        // static method can access only static var but not non-static var
    }

    void printanything()
    {
        System.out.println(colour); // it default takes as this.colour
        System.out.println(x);
        // non-static method can access both static and non-static var
    }



}
