import java.util.Scanner;

/**
 * This program determines which of the 2 numbers input is the largest one
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a first integer
    System.out.println("Please enter an integer:");
    // declare and initialize a variable for integer 1
    int integerA = input.nextInt();

    // ask the user for a second integer
    System.out.println("Please enter another integer:");
    // declare and initialize a variable for integer 2
    int integerB = input.nextInt();

    // determine which integer is greater
    if(integerA > integerB){
      System.out.println("The biggest number is " + integerA + ".");
    } else if (integerA < integerB) {
      System.out.println("The biggest number is " + integerB + ".");
    } else {
      System.out.println("There is no biggest number.");
    }
  }
}
