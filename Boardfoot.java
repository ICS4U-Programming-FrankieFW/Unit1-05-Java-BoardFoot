
/**
* This program is used to find the result for the Board foot equation  
*
* @author Frankie Fox
* @version 1.0
* @since   2024-19-03
*/
import java.util.*;

public class Boardfoot {
    public static void main(String[] args) {

        final double LENGTH_BOARD_FOOT = 144;
        double Userwidth;
        double Userheight;
        double Lengthequation;
        try {

            Scanner sc = new Scanner(System.in);
            //This print out to the user to input a width
            System.out.print(" Please enter your width (inches) : ");
            //Turns Userwidth into a double 
            Userwidth = sc.nextDouble();
            //This prints out to the user to input a height
            System.out.print(" Please enter your height (inches) : ");
            //Turns Userheight into a double 
            Userheight = sc.nextDouble();
            //This checks if the number height is a negative or zero 
            if (Userheight <= 0 || Userwidth <= 0 ) {
                System.out.println("Please enter a positive number. ");
            }

            else 
            {

                //This is the code that solves the Length equation
                Lengthequation = (LENGTH_BOARD_FOOT / (Userwidth * Userheight));
                //This prints out the first printing statement
                System.out.print("The wood is ");
                //This is the second print statement that formats it into 2 decimal places 
                System.out.format("%.1f", Lengthequation);
               //This tells the user how long it has to be for a foot
                System.out.println(" This needs to be 144 inches long. ");
            }

        } catch (Exception e) {
            //This prints error when it is given a string
            System.out.println("Error: Invalid input entered.");

        }
    }
}
