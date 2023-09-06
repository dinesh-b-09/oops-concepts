package inheritance;

public class Car extends Vehicle
{

    boolean hasAC;

     Car(String colour, int noofwheels, int maxspeed, int range, boolean hasAC) {
        super(colour,noofwheels,maxspeed,range);  // calling vehicle constructor
        this.hasAC = hasAC;
    }

    Car(boolean hasAC)
    {
        super();// even if we dont give super() it implicitly call default vehicle constructor
        this.hasAC = hasAC;
    }

    @Override
    void moveforward() {
        //super.moveforward();
        System.out.println("car moving forward");
    }
}
