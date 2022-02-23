import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	double gallonsGas = 0;
    double milesGallon = 0;
    double gasGallon = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("How many gallons of gas are in your tank?: ");
        gallonsGas = in.nextDouble();

        System.out.print("How many miles per gallon does your car get?: ");
        milesGallon = in.nextDouble();

        System.out.print("What is the price per gallon of gas?: ");
        gasGallon = in.nextDouble();

        double hundredMiles = (100/milesGallon)*gasGallon;
        double howFar = gallonsGas * milesGallon;

        System.out.println("The cost to go 100 miles with your car at $" + gasGallon + " a gallon would be $" + hundredMiles );
        System.out.println("The farthest you can go with the amount of gas in your tank is " + howFar + " miles.");


    }


}
