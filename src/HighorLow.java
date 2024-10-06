import java.util.Scanner;
import java.util.Random;

public class HighorLow {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean done = false;
        String trash;
        System.out.println("Guess an integer 1-10 and we'll tell you if you got it right.");


        do {
            done = true;
            if (obj.hasNextInt())
            {
                userGuess = obj.nextInt();
                if (userGuess < 1 | userGuess > 10)
                {
                    System.out.println("Invalid input.");
                    done = false;
                }
            }

            else
            {
                obj.nextLine();
                System.out.println("Invalid input.");
                done = true;
            }
        }while (!done);


        if (userGuess == i)
        {
            System.out.println("Your guess was right!");
        }
        else if (userGuess > i)
        {
            System.out.println("Your guess was too high.");
        }
        else if (userGuess < i)
        {
            System.out.println("Your guess was too low.");
        }

        System.out.println("The random number was " + i);


    }
}
