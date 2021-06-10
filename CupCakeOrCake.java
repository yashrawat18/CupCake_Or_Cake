import java.util.Scanner;

public class CupCakeOrCake{

  public static void main(String[] args)
  {

    System.out.println("Welcome to Cake and CupCake shop!");
    System.out.println("We make custom with our secret cake batter!");

    String name; //User's first name
    String itemOrder; // Item Ordered
    int 	 itemQuantity;//item Quantity
    String frostingType; // Frosting ordered
    String fillingType; //Filling ordered
    String toppings; //Toppings ordered
    String input; //User Input

    double CakeCost =15.00; //Cost of cake
    double CupCakeCost = 10.00; //CupCake Cost
    final double TAX_RATE = .08;
    double tax;
    char ch='n';//choice from user whether to place order or not

    Scanner inputData = new Scanner(System.in);
    System.out.println("Please tell your name:");
    name = inputData.nextLine();

    System.out.println("Hello "+ name + ", please see our Menu below to place your order: ");
		
		do{
    System.out.println("__________________________________________________");
    System.out.println("S.No    Items       Quantity    BASE COST");
    System.out.println("__________________________________________________");
    System.out.println(" 1      Cake          1          $15.00");
    System.out.println(" 2  Set of CupCakes   1          $10.00");
    System.out.println("--------------------------------------------------");
    System.out.println("");     
    System.out.println("Seasonal Offer: Buy Both Cake and set of CupCakes for only $22.50");
    System.out.println("");
    System.out.println("Are you ready to Place Order?(y/n)");
    ch = inputData.next().charAt(0);
    }while(ch!='y');
    
    System.out.print("To order both items please enter \"Both\"");
    System.out.println("");
    itemOrder =inputData.nextLine();
    System.out.println("Please choose Frostings(vanila,chocolate,strawberry,coco)");
    frostingType = inputData.nextLine();
    System.out.println("Please choose Fillings(mocho,mint,lemon,caramel,vanilla)"); 
    fillingType = inputData.nextLine();
    System.out.println("Please choose Toppings(sprinkles,cinnamon,cocoa,nuts)");
    toppings = inputData.nextLine();
    System.out.println("");
    System.out.println("Your Order is:");
    System.out.println();
  }
}