public class StallFoodMenu {

    private String foodName;
    private String calories;
    private double price;


    
    public StallFoodMenu(String foodName, String calories, double price) {
        this.foodName = foodName;
        this.calories = calories;
        this.price = price;
    }


    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    public String getCalories() {
        return calories;
    }
    public void setCalories(String calories) {
        this.calories = calories;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    


}
