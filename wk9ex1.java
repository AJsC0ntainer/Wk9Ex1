// Import the Scanner class.
import java.util.Scanner; 

public class wk9ex1
{
    public static void main(String[] args)
    {
        // Create a Scanner object.
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        //Program Title.
        System.out.println("INTEREST CALCULATOR PROGRAM");
        //Styling.
        System.out.println("---------------------------");
        //Ask user for principal amount input.
        System.out.println("What is the principal amount of the loan in dollars?");
        //Declare a variable and initialize it with the value entered by the user.
        String input = myObj.nextLine();
        //Convert the string to a double.
        double principal = Double.parseDouble(input);
        //Ask user for interest rate input.
        System.out.println("What is the interest rate (input 0.05 for 5%)?");
        //Declare a variable and initialize it with the value entered by the user.
        input = myObj.nextLine();
        //Convert the string to a double.
        double rate = Double.parseDouble(input);
        //Ask user for period of loan input.
        System.out.println("What is the period of loan in years?");
        //Declare a variable and initialize it with the value entered by the user.
        input = myObj.nextLine();
        //Convert the string to an integer.
        int time = Integer.parseInt(input);
        //Declare a variable and initialize it with the formula to calculate the total interest of the loan.
        double interest = principal * rate * time;
        //Print the total interest of the loan.
        System.out.println("Total interest of loan is: " + String.format("%.0f", interest) + " " + "dollars.");
        
        //Close the Scanner object.
        myObj.close();
        //End of program message.
        System.out.println("\nEnd of program!\n");

        //Pushed to GitHub Wk9Ex1 Repository.
    }
      
}