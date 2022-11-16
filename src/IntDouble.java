/**
 * this code shows behaviour of arithmetic operation
 *  for integer and double
 *  as well as data conversion
 * @author Nima Mansouri
 * @version 20220907
 */
public class IntDouble
{
    public static void main(String[] args)
    {
        //variable declaration
        int     i1 = 5,
                i2 = 3,
                i3;
        double  d1 = 5.0,
                d2 = 3.0,
                d3;

        //division
        System.out.println("i1/i2: " + i1 / i2);
        System.out.println("d1/d2: " + d1 / d2);
        System.out.println("i1/d2: " + i1 / d2);
        //test these lines and fix it if needed
        d3 = i1/i2;
        System.out.println("d3: " + d3);
        i3 = (int) (d1/d2);
        System.out.println("i3: " + i3);

    }
}