import java.util.ArrayList;

public class Dealership {
    private Dealer dealer;
    private Till till;
    private Customer customer;
    private ArrayList<Vehicle> vehicles;

    public Dealership(Dealer dealer, Till till, Customer customer, ArrayList<Vehicle> vehicles){
        this.dealer = dealer;
        this.till = till;
        this.customer = customer;
        this.vehicles = vehicles;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public Till getTill() {
        return this.till;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public int vehiclesCount(){
        return this.vehicles.size();
    }

    public void buyNewVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
        this.till.decreaseMoney(vehicle.getPrice());
    }
}
