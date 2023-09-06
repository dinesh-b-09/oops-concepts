package inheritance;

public class Scooter extends Vehicle
{
    boolean haskickstart;

    Scooter(String colour, int noofwheels, int maxspeed, int range, boolean haskickstart)
    {
        super(colour, noofwheels, maxspeed, range);
        this.haskickstart = haskickstart;
    }

    @Override
    void moveforward() {
     //   super.moveforward();
        System.out.println("scooter moving forward");
    }
}
