import java.util.Scanner;  // Import the Scanner class

public class wk9ex1
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        
        System.out.println("INTEREST CALCULATOR PROGRAM");
        System.out.println("---------------------------");
        System.out.println("What is the principal amount of the loan in dollars?");
        String input = myObj.nextLine();  // Read user input
        double principal = Double.parseDouble(input);
        System.out.println("What is the interest rate (input 0.05 for 5%)?");
        input = myObj.nextLine();  // Read user input
        double rate = Double.parseDouble(input);
        System.out.println("What is the period of loan in years?");
        input = myObj.nextLine();  // Read user input
        int time = Integer.parseInt(input);

        double interest = principal * rate * time;

        System.out.println("Total interest of loan is: " + String.format("%.0f", interest) + " " + "dollars.");
      
    }
}

