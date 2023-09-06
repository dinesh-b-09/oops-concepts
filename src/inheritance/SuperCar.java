package inheritance;

public class SuperCar extends Car
{
    boolean hasNitro;

    SuperCar(String colour, int noofwheels, int maxspeed, int range, boolean hasAC, boolean hasNitro)
    {
        super(colour, noofwheels, maxspeed, range, hasAC);
        this.hasNitro = hasNitro;
    }

    @Override
    void moveforward() {
       // super.moveforward();
        System.out.println("supercar moving forward");
    }
}
