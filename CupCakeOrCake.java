import java.util.Scanner;

public class CupCakeOrCake{

  public static void main(String[] args)
  {

    System.out.println("Welcome to Cake and CupCake shop!");
    System.out.println("We make custom with our secret cake batter!");

    String name; //User's first name
    String itemOrder; // Item Ordered
    String frostingType; // Frosting ordered
    String fillingType; //Filling ordered
    String toppings; //Toppings ordered
    String input; //User Input

    double CakeCost =15.00; //Cost of cake
    double CupCakeCost = 10.00; //CupCake Cost
    final double TAX_RATE = .08;
    double tax;

    Scanner inputData = new Scanner(System.in);
    System.out.println("Please tell your name:");
    name = inputData.nextLine();

    System.out.println("Hello "+ name + ", please see our Menu below to place your order: ");

    System.out.println("__________________________________________________");
    System.out.println("S.No    Items       Quantity    BASE COST");
    System.out.println("__________________________________________________");
    System.out.println(" 1      Cake          1          $15.00");
    System.out.println(" 2  Set of CupCakes   1          $10.00");
  }
}