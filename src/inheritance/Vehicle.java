package inheritance;

public class Vehicle
{
    String colour;
    int noofwheels;
    int maxspeed;
    int range;

    Vehicle(){}

    Vehicle(String colour, int noofwheels, int maxspeed, int range)
    {
        this.colour = colour;
        this.noofwheels = noofwheels;
        this.maxspeed = maxspeed;
        this.range = range;
    }

    void moveforward()
    {
        System.out.println("Vehicle moving forward");
    }

    @Override
    public String toString()   // if we don't give this then it will take object class toString()
    {
        return "This is a Vehicle";
    }

}
