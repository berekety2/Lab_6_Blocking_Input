import java.util.Scanner;

public class RectangleInfo {

    public static void main(String [] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("What are the width and length of the triangle");
        double theLength = 0;
        double theWidth = 0;
        boolean done = false;
        String trash;

        //process input
        do {
            if (obj.hasNextDouble())
            {
                theLength = obj.nextDouble();
                done = true;
            }
            else
            {
                trash = obj.nextLine();
                System.out.println("Invalid input.");
            }
        } while (!done);

        do {
            if (obj.hasNextDouble())
            {
                theWidth = obj.nextDouble();
                done = true;
            }
            else
            {
                trash = obj.nextLine();
                System.out.println("Invalid input.");
            }
        } while (!done);



        double theArea = theLength * theWidth;
        double thePerimeter = 2 * (theLength + theWidth);
        double theDiagonal = Math.sqrt((theLength * theLength)+ (theWidth * theWidth));

        System.out.println("The area is " + theArea + ", and the perimeter is " + thePerimeter);
        System.out.println("The diagonal is " + theDiagonal);





    }
}
