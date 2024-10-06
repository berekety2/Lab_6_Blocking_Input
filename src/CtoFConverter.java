import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        System.out.println("What is the current temperature in Celsius?");
        Scanner obj = new Scanner(System.in);
        double doubleCelsius = 0;
        double doubleFahrenheit = 0;
        boolean done = false;
        String trash;

        //process input
        do {
            if (obj.hasNextDouble())
            {
                doubleCelsius = obj.nextDouble();
                done = true;
            }
            else
            {
                trash = obj.nextLine();
                System.out.println("Invalid input.");
            }
        } while (!done);



        doubleFahrenheit = (doubleCelsius * 9/5) + 32;
        System.out.println("The temperature in fahrenheit is " + doubleFahrenheit + "degrees");

        if (doubleFahrenheit >= 100)
        {
            System.out.println("It is boiling!");
        }
        if (doubleFahrenheit <= 0)
        {
            System.out.println("It is freezing!");
        }


    }
}
