import java.util.ArrayList;
import java.util.Scanner;


public class aOrderingSystem {
    
    static ArrayList<HawkerFoodStall> stall_arr = new ArrayList<HawkerFoodStall>();
    public ArrayList<String> addFoodToCart = new ArrayList<String>();
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        boolean menuSelectionCounter = false;
        

        System.out.println("\nWelcome to Hawker Food Ordering System ! \n");
        
        while(menuSelectionCounter == false){

            String menu_1 = "Create / Delete of Hawker Food Stalls";
            String menu_2 = "Create / Delete of Stall Food Menu";
            String menu_3 = "Create / Delete Order Account";
            String menu_4 = "Verification of Order Account";
            String menu_5 = "Browse Hawker Stalls and their Food Menu";
            String menu_6 = "Ordering of Food";
            String menu_7 = "Check Order Account Total Amount";
            String menu_8 = "Order Account Preferences";

            String menu_9 = "Check List";

            boolean backToMainMenu = true;

            while(backToMainMenu == true){
                System.out.println("-------\t--------------------------------------------");
                System.out.printf("Actions\t\t%s%n","  Main Menu");
                System.out.println("-------\t--------------------------------------------");
                System.out.printf("  1.\t%s%n  2.\t%s%n  3.\t%s%n  4.\t%s%n  5.\t%s%n  6.\t%s%n  7.\t%s%n  8.\t%s%n  9.\t%s%n" 
                                , menu_1, menu_2, menu_3, menu_4, menu_5, menu_6, menu_7, menu_8, menu_9);
                System.out.println("-------\t--------------------------------------------");
                
                System.out.print("\nPlease enter menu to enter (1-9) : ");
                String menuSelection = input.nextLine();
                System.out.println();

                    switch(menuSelection){
                        case "1":
                            menuSelection = "1";
                            menuSelectionCounter = true;
                            break;
                        case "2":
                            menuSelection = "2";
                            menuSelectionCounter = true;
                            break;
                        case "3":
                            menuSelection = "3";
                            menuSelectionCounter = true;
                            break;
                        case "4":
                            menuSelection = "4";
                            menuSelectionCounter = true;
                            break;
                        case "5":
                            menuSelection = "5";
                            menuSelectionCounter = true;
                            break;
                        case "6":
                            menuSelection = "6";
                            menuSelectionCounter = true;
                            break;
                        case "7":
                            menuSelection = "7";
                            menuSelectionCounter = true;
                            break;
                        case "8":
                            menuSelection = "8";
                            menuSelectionCounter = true;
                            break;
                        case "9":
                            menuSelection = "9";
                            menuSelectionCounter = true;
                            break;
                        default:
                            System.out.println();
                            System.out.println("Invalid Entry ! Press enter to continue...");
                            String blankEnter = input.nextLine();
                            menuSelectionCounter = false;
                            break; 
                    }
                    
                    while (menuSelection == "1"){
                        Scanner inputForMenu_1 = new Scanner(System.in);
                        System.out.println("Do you want to Create(1) or Delete(2) a Hawker Food Stall ?\n\t(Press 1 to create) | (Press 2 to delete): ");
                        int createOrDelete = inputForMenu_1.nextInt();
                        System.out.println();
                        if(createOrDelete == 1){
                            addNewHawkerFoodStall();
                            System.out.println();
                            stallInfo();
                            System.out.println();
                            System.out.println("Hawker Food Stall created successfully !\n");
                            backToMainMenu = true;
                            menuSelection = "0";
                        }else if(createOrDelete == 2){
                            removeHawkerFoodStall();
                            backToMainMenu = true;
                            menuSelection = "0";
                        }else{
                            System.out.println("Invalid entry ! Press enter to continue...");
                            String blankEnter = input.nextLine();
                            menuSelection = "1";
                        }
                    }

                    while (menuSelection == "2"){
                        Scanner inputForMenu_2 = new Scanner(System.in);
                        
                        System.out.println("Do you want to Create(1) or Delete(2) a Food Menu ?\n\t(Press 1 to create) | (Press 2 to delete):\n");
                        int createOrDelete = inputForMenu_2.nextInt();

                        if(createOrDelete == 1){
                            Scanner inputForMenu_2b = new Scanner(System.in);
                            System.out.println("Please enter food name : ");
                            String foodName = inputForMenu_2b.nextLine();
                            System.out.println("Please enter the calories : ");
                            String calories = inputForMenu_2b.nextLine();
                            System.out.println("Please enter the price : ");
                            Double price = inputForMenu_2b.nextDouble();
                            stallInfo();
                            System.out.println("Which stall would you want to add food menu to : ");
                            int indexNum = inputForMenu_2b.nextInt();
                            HawkerFoodStall tmpHFS =  stall_arr.get(indexNum);
                            tmpHFS.addNewFoodMenu(foodName, calories, price);
                            System.out.println();
                            backToMainMenu = true;
                            menuSelection = "0";
                        }else if(createOrDelete == 2){
                            Scanner inputforMenu_2c = new Scanner(System.in);
                            stallInfo();
                            System.out.println("Which stall food menu would you like to remove ?");
                            int indexNum = inputforMenu_2c.nextInt();
                            HawkerFoodStall tmpHFS = stall_arr.get(indexNum);
                            tmpHFS.deleteFoodMenu();
                            backToMainMenu = true;
                            menuSelection = "0";
                        }else{
                            System.out.println("Invalid entry ! Press enter to continue...");
                            String blankEnter = input.nextLine();
                            menuSelection = "2";
                        }

                    }

                    while (menuSelection == "3"){
                        Scanner inputforMenu_3 = new Scanner(System.in);

                        System.out.println("Do you want to Create(1) or Delete(2) an Account ?\n\t(Press 1 to create) | (Press 2 to delete):\n");
                        int createOrDelete = inputforMenu_3.nextInt();

                        if(createOrDelete == 1){
                            OrderAccount.addAccount();
                            menuSelection = "0";
                        }else if(createOrDelete == 2){
                            OrderAccount.deleteAccountOrder();
                            menuSelection = "0";
                        }else{
                            System.out.println("Invalid entry ! Press enter to continue...");
                            String blankEnter = input.nextLine();
                            menuSelection = "3";
                        }

                    }

                    while (menuSelection == "4"){
                        System.out.println();
                        OrderAccount.userAccountVerification();
                        backToMainMenu = true;
                        menuSelection = "0";
                    }

                    while (menuSelection == "5"){
                        Scanner inputForMenu_5 = new Scanner(System.in);
                        stallInfo();
                        System.out.println("Which hawker stall menu would you like to browse : ");
                        int indexNum = inputForMenu_5.nextInt();
                        System.out.println();
                        HawkerFoodStall tmpHFS = stall_arr.get(indexNum);
                        tmpHFS.foodInfo();
                        backToMainMenu = true;
                        menuSelection = "0";
                    }

                    while (menuSelection == "6"){
                        Scanner inputForMenu_6 = new Scanner(System.in);
                        stallInfo();
                        System.out.println("Which food stall would you like to choose from ? ");
                        int indexNum = inputForMenu_6.nextInt();
                        System.out.println();
                        HawkerFoodStall tmpHFS = stall_arr.get(indexNum);
                        tmpHFS.foodInfo();
                        
                        System.out.println("Please enter index number to add to cart : ");
                        int indexNum_food = inputForMenu_6.nextInt();
                        

                        backToMainMenu = true;
                        menuSelection = "0";
                    }

                    while (menuSelection == "7"){
                        System.out.println("Total : ");
                        backToMainMenu = true;
                        menuSelection = "0";
                    }

                    while (menuSelection == "8"){
                        System.out.println("Please enter Order Account ID : ");


                        backToMainMenu = true;
                        menuSelection = "0";

                    }

                    while(menuSelection == "9"){
                        
                        OrderAccount.DisplayAccount_arr();
                        
                        menuSelection = "0";
                    }





                }
            }
            
            

    }

    //______________________________________________________________
    //______________________________________________________________


    public static void addNewHawkerFoodStall() {
        Scanner create_input = new Scanner(System.in);

        System.out.println("Please enter Stall name : ");
        String stallName = create_input.nextLine();
        System.out.println("Please enter Stall description : ");
        String description = create_input.nextLine();
        System.out.println("Please enter Stall Owner Name : ");
        String ownerName = create_input.nextLine();
        System.out.println("Please enter the address : ");
        String address = create_input.nextLine();
        System.out.println("Please enter the postal code : ");
        int postalCode = create_input.nextInt();

        HawkerFoodStall newStall = new HawkerFoodStall(stallName, description, ownerName, address, postalCode);
        stall_arr.add(newStall);
    }

    public static void removeHawkerFoodStall() {
        Scanner remove_input = new Scanner(System.in);

        stallInfo();

        System.out.println("Please refer to the Hawker Stall list and enter the Index :\n(The first list starts with [0])");
        int indexNum = remove_input.nextInt();
        if (indexNum < 0){
            throw new IllegalArgumentException("Index number must be more than 0 !");
        }
        stall_arr.remove(indexNum);
        System.out.println("\nStall has been removed !\n");
        stallInfo();
    }

    public static void stallInfo(){

        System.out.println("List of Hawker Stall");
        System.out.println("--------------------");

        for(HawkerFoodStall dummy_arr : stall_arr){
            System.out.printf("Stall name : %s%nOwner : %s%nAddress : %s, %d%nDescription : %s%n--------------------\n\n",
                                dummy_arr.getStallName(), dummy_arr.getOwnerName(),dummy_arr.getAddress()
                              , dummy_arr.getPostalCode(), dummy_arr.getDescription());
        }
        System.out.println("Press enter to continue...");
        Scanner dummyInput = new Scanner(System.in);
        String dummyinput = dummyInput.nextLine();
        System.out.println();
    }


    public void addFoodToCart(String foodItem){
        addFoodToCart.add(foodItem);

    }





    public String getMostExpensiveFood() {
        
        String exFoodName = "";
        double exFoodPrice = 0;

        for (HawkerFoodStall stallFood_Menu : stall_arr){

        }

        return null;
        
    }




}
