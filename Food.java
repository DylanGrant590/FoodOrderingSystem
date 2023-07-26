import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		
		//Loops menu
		Food menu = new Food();
	    menu.display();
		}

		//Prints a welcome statement to the user.
		public void display() {
			
			String beefPatty = "Beef Patty";
			String chickenPatty = "Chicken Patty";
			String shrimpPatty = "Shrimp Patty";
			String vegPatty = "Vegetable Patty";
			String cheesePatty = "Cheese Patty";
			String meatLoaf = "Meat Loaf";
			String smallSoup = "Small Soup";
			String bananaBread = "Banana Bread";
			String carrotCake = "Carrot Cake";
			String cocoBread = "Coco Bread";
			String wata = "Wata";
			String cranWata = "Cran Wata";
			String boxJuice = "Box Juice";
			String truJuice = "Tru Juice";
			String stew = "Stew Chicken";
			String curry = "Curry Chicken";
			String veg = "Steam Veg Callaloo";
			String liver = "Brown Stew Liver";
			String porridge = "Juici Porridge";
			String fries = "Small Fries";
			int beefPrice = 370;
			int chickenPrice = 370;
			int shrimpPrice = 490;
			int vegPrice = 390;
			int cheesePrice = 420;
			int meatloafPrice = 480;
			int smallsoupPrice = 390;
			int bbPrice = 220;
			int ccPrice = 220;
			int cbPrice = 150;
			int wataPrice = 170;
			int cwPrice = 200;
			int bjPrice = 220;
			int tjPrice = 290;
			int stewPrice = 950;
			int curryPrice = 950;
			int svegPrice = 950;
			int liverPrice = 950;
			int porridgePrice = 400;
			int friesPrice = 300;
		
		//System objects.
		Scanner scanner = new Scanner(System.in);
					
		System.out.println("#########################");
		System.out.println("#Welcome to Juici Patty!#");
		System.out.println("#########################");
		System.out.println("");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
        	System.out.println("***********************************************");
        	System.out.println("Please enter a number from the following menu: ");
        	  System.out.println("1) Beef Patty.\n" +
                      "2) Chicken Patty.\n" +
                      "3) Shrimp Patty.\n" +
                      "4) Vegetable Patty.\n" +
                      "5) Cheese Patty.\n" +
                      "6) Meat Loaf.\n" +
                      "7) Small Soup.\n" +
                      "8) Banana Bread.\n" +
                      "9) Carrot Cake.\n" +
                      "10) Coco Bread.\n" +
                      "11) Wata.\n" +
                      "12) Cran Wata.\n" +
                      "13) Box Juice. \n" +
                      "14) Tru Juice.\n" +
                      "15) Stew Chicken.\n" +
                      "16) Curry Chicken.\n" +
                      "17) Steamed Veg Callalo.\n" +
                      "18) Brown Stew Liver.\n" +
                      "19) Juici Porridge.\n" +
                      "20) Small Fries.\n" +
                      "21) Exit Menu.");
            System.out.println("*************************************************");
    
            int input = scanner.nextInt();
            
            if (input == 1) {
            	System.out.println("\nYou ordered a " + beefPatty + "," + " the price is: " + "$" + beefPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 2) {
            	System.out.println("\nYou ordered a " + chickenPatty + "," + " the price is: " + "$" + chickenPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 3) {
            	System.out.println("\nYou ordered a " + shrimpPatty + "," + " the price is: " + "$" + shrimpPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 4) {
            	System.out.println("\nYou ordered a " + vegPatty + "," + " the price is: " + "$" + vegPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 5) {
            	System.out.println("\nYou ordered a " + cheesePatty + "," + " the price is: " + "$" + cheesePrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 6) {
            	System.out.println("\nYou ordered a " + meatLoaf + "," + " the price is: " + "$" + meatloafPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 7) {
            	System.out.println("\nYou ordered a " + smallSoup + "," + " the price is: " + "$" + smallsoupPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 8) {
            	System.out.println("\nYou ordered a " + bananaBread + "," + " the price is: " + "$" + bbPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 9) {
            	System.out.println("\nYou ordered a " + carrotCake + "," + " the price is: " + "$" + ccPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 10) {
            	System.out.println("\nYou ordered a " + cocoBread + "," + " the price is: " + "$" + cbPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 11) {
            	System.out.println("\nYou ordered a " + wata + "," + " the price is: " + "$" + wataPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 12) {
            	System.out.println("\nYou ordered a " + cranWata + "," + " the price is: " + "$" + cwPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 13) {
            	System.out.println("\nYou ordered a " + boxJuice + "," + " the price is: " + "$" + bjPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 14) {
            	System.out.println("\nYou ordered a " + truJuice + "," + " the price is: " + "$" + tjPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 15) {
            	System.out.println("\nYou ordered a " + stew + "," + " the price is: " + "$" + stewPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 16) {
            	System.out.println("\nYou ordered a " + curry + "," + " the price is: " + "$" + curryPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 17) {
            	System.out.println("\nYou ordered a " + veg + "," + " the price is: " + "$" + svegPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 18) {
            	System.out.println("\nYou ordered a " + liver + "," + " the price is: " + "$" + liverPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 19) {
            	System.out.println("\nYou ordered a " + porridge + "," + " the price is: " + "$" + porridgePrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 20) {
            	System.out.println("\nYou ordered a " + fries + "," + " the price is: " + "$" + friesPrice);
            	System.out.println("\nPlease enter the price listed above to pay for your food: ");
            	beefPrice = scanner.nextInt();
            	System.out.println("\nThank you for doing business with us!");
            	System.out.println("");
            	display();
            }
            else if (input == 21) {
        	System.out.println("---------------------------------------");
            System.out.println("\nThank you for doing business with us!"); 
            System.out.println("---------------------------------------"); 
            System.exit(0);
            scanner.close();
            }
            
            else {
                System.out.println("\nInvalid Input. Please Try Again!");
                System.out.println("");
                display();
        	}
        }
	}