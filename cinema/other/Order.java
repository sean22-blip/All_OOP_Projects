package other;

import user.IStaff;

public class Order {

    private int orderId;
    private String timeOfPurchase;
    private double total = 0;

    //Classes to serve as attributes for Order class
    private Customer customer;
    private IStaff istaff;

    public Order(int orderId, String timeOfPurchase, Customer customer,
            IStaff istaff) {
        setOrderId(orderId);
        setTimeofPurchase(timeOfPurchase);
        setCustomer(customer);
        setStaff(istaff);
    }

    //Getters
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public IStaff getStaff() {
        return istaff;
    }

    public void getTotal() {
    }

    //Setters
    public void setTimeofPurchase(String timeOfBuy) {
    }

    public void setOrderId(int orderId) {
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setStaff(IStaff istaff) {
        this.istaff = istaff;
    }

    //methods
    public void createOrder() {
    }

    public void printReciept() {
    }

}
