package objectclass;

public class Complex
{
    int real;
    int img;

    public Complex(int real, int img)
    {
        this.real=real;
        this.img=img;
    }

    public void add(Complex x)
    {
        real += x.real;
        img += x.img;
    }

    public void print()
    {
        System.out.println(real+" + "+img+"i");
    }

    public void sub(Complex x)
    {
        real -= x.real;
        img -= x.img;
    }
}
