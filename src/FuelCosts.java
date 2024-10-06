import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("How many gallons of gas are in your tank?");
        System.out.println("How many miles per gallon does your car go?");
        System.out.println("How much does gas cost per gallon?");
        double gallonsOfGas = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        boolean done = false;
        String trash;

        //process input

        do {
            if (obj.hasNextDouble())
            {
                gallonsOfGas = obj.nextDouble();
                done = true;
            }
            else
            {
                trash = obj.nextLine();
                System.out.println("Invalid input!");
            }
        } while (!done);

        do {
            if (obj.hasNextDouble())
            {
                fuelEfficiency = obj.nextDouble();
                done = true;
            }
            else
            {
                trash = obj.nextLine();
                System.out.println("Invalid input!");
            }
        } while (!done);

        do {
            if (obj.hasNextDouble())
            {
                pricePerGallon = obj.nextDouble();
                done = true;
            }
            else
            {
                trash = obj.nextLine();
                System.out.println("Invalid input");
            }
        }while (!done);

        double hundredMiles =  pricePerGallon / fuelEfficiency  * 100;
        double distanceWithFull = fuelEfficiency * gallonsOfGas;

        System.out.println("It costs $" + hundredMiles + " to drive 100 miles!");
        System.out.println("Your car can go " + distanceWithFull + " miles with a full tank of gas.");




    }
}