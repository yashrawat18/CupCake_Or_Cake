import java.util.Scanner;

public class CupCakeOrCake{

	private static String name; //User's first name
	private static String itemOrder; // Item Ordered
	private static int itemQuantity;//item Quantity
	private static double billAmount;
	private static String frostingType; // Frosting ordered
	private static String fillingType; //Filling ordered
	private static String toppings; //Toppings ordered
	private static String input; //User Input

	private static double CakeCost =15.00; //Cost of cake
	private static double CupCakeCost = 10.00; //CupCake Cost
	private static final double TAX_RATE = .08;
	private static double tax;
	private static char ch='n';//choice from user whether to place order or not

	static Scanner inputData = new Scanner(System.in);

	public static void main(String[] args)
  {

    System.out.println("Welcome to Cake and CupCake shop!");
    System.out.println("We make custom with our secret cake batter!");

   
   
    System.out.println("Please tell your name:");
    name = inputData.nextLine();

    System.out.println("Hello "+ name + ", please see our Menu below to place your order: ");
    do{
    orderMenu();
		
    System.out.print("To order both items please enter \"Both\"");
    System.out.println();
    itemOrder =inputData.nextLine();
    if(itemOrder.equalsIgnoreCase("Cake"))
    {
    	System.out.println("Please tell us the Quantity:");
    	itemQuantity = Integer.parseInt(inputData.nextLine());
    	if(itemQuantity!=0){
    	addOns();
    	calculateAmount(itemOrder,itemQuantity);
    	    	
    	System.out.println("");
		  System.out.println("-----------------Your Order Summary:---------------");
		  System.out.println("___________________________________________________");
		  System.out.println("		 "+"Item" + "		"+"Quantity");
		  System.out.println("___________________________________________________");		  
		  System.out.println("		 "+itemOrder +"	  	 "+itemQuantity);
		  System.out.println("---------------------------------------------------");
		  System.out.println("  Total:			$"+billAmount);
		  System.out.println("Thank you for placing the order!");
      System.out.println("Your order will arrive in 5 mins.");
      System.out.println();
      System.out.println("Do you want to place another order(y/n)");
      ch = inputData.nextLine().charAt(0);
		  }
		  else{
		  	System.out.println("Please enter a VALID Quantity");
		  }
    }
    else if(itemOrder.equalsIgnoreCase("CupCakes"))
    {
    	System.out.println("Please tell us the Quantity:");
    	itemQuantity = Integer.parseInt(inputData.nextLine());
    	if(itemQuantity!=0){
    	addOns();
    	calculateAmount(itemOrder,itemQuantity);
    	
    	System.out.println("");
		  System.out.println("-----------------Your Order Summary:---------------");
		  System.out.println("___________________________________________________");
		  System.out.println("		 "+"Item" + "		"+"Quantity");
		  System.out.println("___________________________________________________");		  
		  System.out.println("		"+itemOrder +"	  "+itemQuantity);
		  System.out.println("---------------------------------------------------");
		  System.out.println("  Total:			 $"+billAmount);
		  System.out.println("Thank you for placing the order!");
      System.out.println("Your order will arrive in 5 mins.");
      System.out.println();
      System.out.println("Do you want to place another order(y/n)");
      ch = inputData.nextLine().charAt(0);
		  }else{
		  	System.out.println("Please enter a VALID Quantity");
		  }
		  
    }
    else if(itemOrder.equalsIgnoreCase("Both"))
    {
    	System.out.println("Please tell us the Quantity for Cake:");    	
    	int cakeQuantity = Integer.parseInt(inputData.nextLine());
    	System.out.println("Please tell us the Quantity for Set of CupCakes:");
    	int cupCakesQuantity = Integer.parseInt(inputData.nextLine());
    	if(cakeQuantity!=0 || cupCakesQuantity!=0){
    	addOns();
    	calculateAmountBoth(cakeQuantity,cupCakesQuantity);
    	
    	System.out.println("");
		  System.out.println("-----------------Your Order Summary:---------------");
		  System.out.println("___________________________________________________");
		  System.out.println("		 "+"Item" + "		"+"Quantity");
		  System.out.println("___________________________________________________");
      System.out.println("		 Cake             "+cakeQuantity);
      System.out.println("	    Set of CupCakes       "+cupCakesQuantity);
      System.out.println("---------------------------------------------------");
      System.out.println("  Total:			 $"+billAmount);
      System.out.println("Thank you for placing the order!");
      System.out.println("Your order will arrive in 5 mins.");
      System.out.println();
      System.out.println("Do you want to place another order(y/n)");
      ch = inputData.nextLine().charAt(0);
		  }
		  else{
		  	System.out.println("Please enter a VALID Quantity");
		  }
    }
    else
    {
    	System.out.println("INVALID CHOICE");
    	System.out.println("Please enter a VALID choice.");
    	
    }
    
    
    }while(ch!='n');
    
    
    
  }
  private static void orderMenu()
  {
  	
		do{
    System.out.println("__________________________________________________");
    System.out.println("S.No    Items       Quantity    BASE COST");
    System.out.println("__________________________________________________");
    System.out.println(" 1      Cake          1          $15.00");
    System.out.println(" 2  Set of CupCakes   1          $10.00");
    System.out.println("--------------------------------------------------");
   // System.out.println("");     
    //System.out.println("Seasonal Offer: Buy Both Cake and set of CupCakes for only $22.50");
    System.out.println("");
    System.out.println("Are you ready to Place Order?(y/n)");
    ch = inputData.nextLine().charAt(0);
    }while(ch!='y'); 
  
  
  }
  private static void addOns()
  {
  	System.out.println("Please choose Frostings(vanila,chocolate,strawberry,coco)");
    frostingType = inputData.nextLine();
    System.out.println("Please choose Fillings(mocho,mint,lemon,caramel,vanilla)"); 
    fillingType = inputData.nextLine();
    System.out.println("Please choose Toppings(sprinkles,cinnamon,cocoa,nuts)");
    toppings = inputData.nextLine();
  
  }
  private static void calculateAmount(String itemOrder,int itemQuantity)
  {
  	if(itemOrder.equalsIgnoreCase("Cake"))
  		billAmount = itemQuantity * 15.00;
  	else
  		billAmount = itemQuantity * 10.00;
  
  }
  private static void calculateAmountBoth(int cakeQuantity,int cupCakesQuantity)
  {
  	billAmount = cakeQuantity * 15.00+cupCakesQuantity*10.00;
  }
}