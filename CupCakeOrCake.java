import java.util.Scanner;

public class CupCakeOrCake{

  private static String name; //User's first name
	private static String itemOrder; // Item Ordered
	private static int itemQuantity;//item Quantity
	private static double billAmount;
	private static String frostingType; // Frosting ordered
	private static String fillingType; //Filling ordered
	private static String toppingType; //Toppings ordered
	private static String input; //User Input
  private static String addOnList="";
	private static double cakeCost =15.00; //Cost of cake
	private static double cupCakeCost = 10.00; //CupCake Cost
	private static final double TAX_RATE = .08;
	private static double tax;
	private static char ch='n';//choice from user whether to place order or not
  private static String choice;
	static Scanner inputData = new Scanner(System.in);

	public static void main(String[] args)
  {
    System.out.println();
    System.out.println();
    System.out.println("Welcome to Cake and CupCake shop!");
    System.out.println("We make custom with our secret cake batter!");

   
    System.out.println();
    System.out.println();
    System.out.println("Please tell your name:");
    name = inputData.nextLine();
    System.out.println();
    System.out.println();
    System.out.println("Hello "+ name + ", please see our Menu below to place your order: ");
    do{
    orderMenu();
		System.out.println();
    System.out.println();
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
      if(!addOnList.equals("")){
        addOnList = addOnList.substring(0,addOnList.length()-2);
        System.out.println("  AddOn List: "+addOnList);
      }
      System.out.println();
      System.out.printf("  Tax                           $%.2f(TAX RATE = 0.08)\n",tax);      
		  System.out.printf("  Total:			$%.2f\n",billAmount+tax);
      System.out.println();
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
    	System.out.println();
      System.out.println();
    	System.out.println("");
		  System.out.println("-----------------Your Order Summary:---------------");
		  System.out.println("___________________________________________________");
		  System.out.println("		 "+"Item" + "		"+"Quantity");
		  System.out.println("___________________________________________________");		  
		  System.out.println("		"+itemOrder +"	  "+itemQuantity);
		  System.out.println("---------------------------------------------------");
      if(!addOnList.equals("")){
        addOnList = addOnList.substring(0,addOnList.length()-2);
        System.out.println("  AddOn List: "+addOnList);
      }
      System.out.println();
      System.out.printf("  Tax                            $%.2f(TAX RATE = 0.08)\n",tax);
		  System.out.printf("  Total:			 $%.2f",billAmount+tax);
      System.out.println();
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
    	System.out.println("Please tell us the Quantity for the Cake:");    	
    	int cakeQuantity = Integer.parseInt(inputData.nextLine());
    	System.out.println("Please tell us the Quantity for the Set of CupCakes:");
    	int cupCakesQuantity = Integer.parseInt(inputData.nextLine());
    	if(cakeQuantity!=0 || cupCakesQuantity!=0){
    	addOns();
    	calculateAmountBoth(cakeQuantity,cupCakesQuantity);
    	System.out.println();
      System.out.println();
    	System.out.println("");
		  System.out.println("-----------------Your Order Summary:---------------");
		  System.out.println("___________________________________________________");
		  System.out.println("		 "+"Item" + "		"+"Quantity");
		  System.out.println("___________________________________________________");
      System.out.println("		 Cake             "+cakeQuantity);
      System.out.println("	    Set of CupCakes       "+cupCakesQuantity);
      System.out.println("---------------------------------------------------");
      if(!addOnList.equals("")){
        addOnList = addOnList.substring(0,addOnList.length()-2);
        System.out.println("  AddOn List: "+addOnList);
      }
      System.out.println();
      System.out.printf("  Tax                            $%.2f(TAX RATE = 0.08)\n",tax);
      System.out.printf("  Total:			 $%.2f\n",billAmount+tax);
      System.out.println();
      System.out.println("Thank you for placing the order!");
      System.out.println("Your order will arrive in 5 mins.");
      System.out.println();
      System.out.println("Do you want to place another order(y/n)");
      ch = inputData.nextLine().charAt(0);
		  }
		  else{
        System.out.println();
        System.out.println();
		  	System.out.println("Please enter a VALID Quantity");
		  }
    }
    else
    {
      System.out.println();
      System.out.println();
    	System.out.println("INVALID CHOICE");
    	System.out.println("Please enter a VALID choice.");
    	
    }
    
    addOnList="";
    billAmount=0;
    tax = 0;
    }while(ch!='n');
    
    
    
  }
  private static void orderMenu()
  {
  	
		do{
    System.out.println();
    System.out.println();
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
    System.out.println();
    System.out.println();
    System.out.println("Do you want Frosting?");
    choice = inputData.nextLine();
    if(choice.equalsIgnoreCase("yes"))
  	{   System.out.println("Please choose a Frosting(Vanilla,Chocolate,Strawberry,Coco)");
        frostingType = inputData.nextLine();
        addItem(frostingType,2);
        addOnList+=", ";
    }
    System.out.println("Do you want Filling?");
    choice = inputData.nextLine();
    if(choice.equalsIgnoreCase("yes"))
    { 
      System.out.println("Please choose a Filling(Mocha,Mint,Lemon,Caramel,Vanilla)"); 
      fillingType = inputData.nextLine();
      addItem(fillingType,3);
      addOnList+=", ";
    }
    System.out.println("Do you want Topping?");
    choice = inputData.nextLine();
    if(choice.equalsIgnoreCase("yes"))
    {
      System.out.println("Please choose a Topping(Sprinkles,Cinnamon,Cocoa,Nuts)");
      toppingType = inputData.nextLine();
      addItem(toppingType,1);
      addOnList+=", ";
    }
  }
  private static void calculateAmount(String itemOrder,int itemQuantity)
  {
  	if(itemOrder.equalsIgnoreCase("Cake"))
  		billAmount+= itemQuantity * cakeCost;
  	else
  		billAmount += itemQuantity * cupCakeCost;

    calculateTax(billAmount);
  
  }
  private static void calculateAmountBoth(int cakeQuantity,int cupCakesQuantity)
  {
  	billAmount+= cakeQuantity * cakeCost+cupCakesQuantity*cupCakeCost;

    calculateTax(billAmount);
  }
  private static void calculateTax(double billAmount)
  {
     tax = billAmount * TAX_RATE;
    // billAmount+=tax;
    
   
  }
  private static void addItem(String itemType,double cost)
  {
      billAmount+=cost;
      addOnList+=itemType;
  }
}