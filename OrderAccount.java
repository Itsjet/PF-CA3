import java.util.ArrayList;
import java.util.Scanner;

public class OrderAccount {
    
    private int accountID;
    private String name;
    private String userName;
    private String password;
    
    static ArrayList<OrderAccount> account_arr = new ArrayList<OrderAccount>();

    public ArrayList<String> foodPreferences = new ArrayList<String>();
    



    public OrderAccount(int accountID, String name, String userName, String password, ArrayList<String> foodPreferences){
        this.accountID = accountID;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.foodPreferences = foodPreferences; 
    }


    public int getAccountID() {
        return accountID;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



    //_____________________________________________________________

    //_____________________________________________________________


    

    public static boolean userAccountVerification() {

        Scanner input = new Scanner(System.in);
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Please enter account ID : ");
        int acc_id = input.nextInt();
        System.out.println("Please enter account password : ");
        String acc_pass = input_2.nextLine();

        boolean verifyStatus = false;

        for(OrderAccount dummy_arr : account_arr){
            if(acc_id == dummy_arr.accountID && acc_pass.equals(dummy_arr.password)){
                verifyStatus = true;
                System.out.println("Account is Verified and Valid!");
                break;
            }else if (acc_id != dummy_arr.accountID && !acc_pass.equals(dummy_arr.password)){
                System.out.println("Account is not found and not Valid !");
            }
        }
        
        return verifyStatus;
    } 

    public static void addAccount(){
        Scanner input = new Scanner(System.in);
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Please enter user an Account ID :");
        int accountID = input_2.nextInt();
        System.out.println("Please enter Name : ");
        String name = input.nextLine();
        System.out.println("Please enter an User Name for the account : ");
        String userName = input.nextLine();

        boolean passwordVer = false;
        String password = null;

        while (passwordVer == false ){
            System.out.println("Please enter password : ");
            password = input.nextLine();
            System.out.println("Please re-enter password : ");
            String reEnterpassword = input.nextLine();
            if(!password.equals(reEnterpassword)){
                System.out.println("Password not match ! Please re-enter new password\n");
                passwordVer = false;
            }else{
                passwordVer = true;
            }
        }

        ArrayList<String> tmp_foodPref = new ArrayList<String>();
        boolean endInput = false;

        while(endInput == false){

            System.out.println("Please enter your food preferences ? Press \"!\" to finish entry. : ");
            String foodPreferences = input.nextLine(); 
            tmp_foodPref.add(foodPreferences);
            
            if(foodPreferences.equals("!")){
                endInput = true;
            }
        }
        ArrayList<String> foodPreferences = tmp_foodPref;
        

        OrderAccount newOrderAccount = new OrderAccount(accountID, name, userName, password, foodPreferences);
        account_arr.add(newOrderAccount);
        System.out.println("\nAccount Created !\n");
    }

    public static void deleteAccountOrder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter account ID : ");
        int userInput = input.nextInt();

        int indexNum = -1;
        int counter = 0;
        for(OrderAccount dummy_accArr : account_arr){

            if(dummy_accArr.accountID == userInput){
                    indexNum = counter;
                    break;
            }
            counter++;
        }
        account_arr.remove(indexNum);
        System.out.println("Account has been removed !\n");
    }   

    public void getTotalPriceOfOrder() {
        
    }

    

    public static void DisplayAccount_arr(){
        for (OrderAccount dummy_arr : account_arr){
            System.out.printf("Account user name : %s%nAccount ID : %d%nAccount own by : %s%nAccount password : %s%nFood preferences : %s%n",
                                dummy_arr.getUserName(), dummy_arr.getAccountID(), dummy_arr.getName(), dummy_arr.getPassword(), dummy_arr.foodPreferences);
        }
    }

}