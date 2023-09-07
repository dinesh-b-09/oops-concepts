package abstraction;

import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        int arr[] =new int[4];
        arr[0]=63;
        arr[1]=21;
        arr[2]=3;
        arr[3]=45;

        Arrays.sort(arr); //sorted and programmer no need to know how it is sorted internally, this is abstraction

        System.out.println(Arrays.toString(arr));
    }
}
