import java.util.ArrayList;
import java.util.Scanner;


public class HawkerFoodStall {

    static Scanner input = new Scanner(System.in);    

    private String stallName;
    private String description;
    private String ownerName;
    private String address;
    private int postalCode;

    public ArrayList<StallFoodMenu>stallFood_Menu = new ArrayList<StallFoodMenu>();
    

    public HawkerFoodStall(String stallName, String description, String ownerName, String address, int postalCode) {
        this.stallName = stallName;
        this.description = description;
        this.ownerName = ownerName;
        this.address = address;
        this.postalCode = postalCode;
    }
    
    
    //  STALL NAME
    public String getStallName() {
        return stallName;
    }
    public void setStallName(String stallName) {
        this.stallName = stallName;
    }
    

    //  DESCRIPTION
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    //  ONWER NAME
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    //  ADDRESS
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    //  POSTAL CODE
    public int getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    //_____________________________________________________________

    //_____________________________________________________________
    
    public static void deleteMenuFromFoodStall(String itemToRemove) {
        
    }

    public static void getMostExpensiveFood() {
        
    }
    public static void getHighestCaloriesFood() {
        
    }

    public void addNewFoodMenu(String foodName, String calories, double price) {
        StallFoodMenu newFoodItem = new StallFoodMenu(foodName, calories, price);
        System.out.println();
        stallFood_Menu.add(newFoodItem);
        System.out.println("\n"+newFoodItem.getFoodName() + " added to menu !\n");
        foodInfo();
        }
    
    public void deleteFoodMenu() {
        Scanner remove_input = new Scanner(System.in);
        foodInfo();
        System.out.println("Please refer to the Food Menu list and enter the Index :\n(The first list starts with [0])");
        int indexNum = remove_input.nextInt();
        if (indexNum < 0){
            throw new IllegalArgumentException("Index number must be more than 0 !");
        }
        stallFood_Menu.remove(indexNum);
        System.out.println("\nFood Menu has been removed !\n");
        System.out.println(); foodInfo();
        System.out.println();
        ;
    }
    
    
    public void foodInfo(){
        System.out.println("List of Food Menu");
        System.out.println("--------------------");

        for(StallFoodMenu dummy_arr : stallFood_Menu){
            System.out.printf("Food name : %s%nCalories : %s%nPrice : $%.2f%n--------------------\n\n"
                            , dummy_arr.getFoodName(), dummy_arr.getCalories(), dummy_arr.getPrice());
        }
        System.out.println("Press enter to continue...");
        Scanner dummyInput = new Scanner(System.in);
        String dummyinput = dummyInput.nextLine();
        System.out.println();
    }
    
    

}
