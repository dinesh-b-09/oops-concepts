package inheritance;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle("black",4,120,300);
        System.out.println(v.colour);

        Car creta = new Car("red",4,150,350,true);
        System.out.println(creta.colour);

        Car c = new Car(true);
        System.out.println(c.hasAC);

        SuperCar bmw = new SuperCar("white",4,240,340,true,true);
        System.out.println(bmw.range);

        Scooter honda = new Scooter("magenta",2,100,250,true);
        System.out.println(honda.maxspeed);

        Vehicle[] arr = new Vehicle[5];
        arr[0] = v;
        arr[1] = creta;
        arr[2] = honda;
        System.out.println(arr[0].colour);
       // System.out.println(arr[1].hasAC); - can't do this because array of vehicle class doesn't have hasAC

        Car[] crr = new Car[5];
        crr[0] = creta;
     //   crr[1] = honda; - can't do this because honda is scooter and array is of car type
        System.out.println(creta.hasAC);

        Vehicle v2 = new Car("blue",4,160,370,true);
        System.out.println(v2.colour);
        //  System.out.println(v2.hasAC); - not possible because Vehicle parent

        v.moveforward();
        creta.moveforward();
        honda.moveforward();
        bmw.moveforward();
        v2.moveforward();    // run-time polymorphism

        System.out.println(v.toString());

    }
}
