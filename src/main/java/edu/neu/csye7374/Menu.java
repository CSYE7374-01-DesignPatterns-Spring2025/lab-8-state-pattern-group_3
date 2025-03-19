package edu.neu.csye7374;

public class Menu implements RestaurantMenuStateAPI{

    private RestaurantMenuStateAPI lunchMenu;
    private RestaurantMenuStateAPI dinnerMenu;
    private RestaurantMenuStateAPI currentState;

    public Menu() {
        this.lunchMenu = new Lunch(this);
        this.dinnerMenu = new Dinner(this);
        this.currentState = new Lunch(this);
    }

    public void setstate(RestaurantMenuStateAPI restaurantMenuStateAPI)
    {
        this.currentState = restaurantMenuStateAPI;
    }
    @Override
    public void displayMenu() {
        this.currentState.displayMenu();
    }

    @Override
    public void lunchMenu() {
        this.currentState.lunchMenu();
    }

    @Override
    public void dinnerMenu() {
        this.currentState.dinnerMenu();
    }

    @Override
    public void displayState() {

    }


    public RestaurantMenuStateAPI getLunchMenu() {
        return this.lunchMenu;
    }

    public RestaurantMenuStateAPI getDinnerMenu() {
        return this.dinnerMenu;
    }
}
