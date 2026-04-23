package controller;

import java.util.ArrayList;

import other.Customer;
import other.Order;
import other.Ticket;
import user.Staff;

public class Cinema {

    private String cinemaName;
    private String address;

    private ArrayList<Staff> staffs;
    private ArrayList<Customer> Customers;
    private ArrayList<Ticket> tickets;
    private ArrayList<Order> orders;

    public static final String CREATE_STAFF = "CREATE_STAFF";
    public static final String CREATE_CUSTOMER = "CREATE_CUSTOMER";
    public static final String CREATE_MENU_ITEM = "CREATE_MENU_ITEM";
    public static final String SET_MENU_AVAILABILITY = "CREATE_MENU_AVAILIBILITY";
    public static final String CREATE_ORDER = "CREATE_ORDER";
    public static final String VIEW_CUSTOMERS = "VIEW_CUSTOMERS";
    public static final String VIEW_ORDERS = "VIEW_ORDERS";
    public static final String UPDATE_ORDER_STATUS = "UPDATE_ORDER_STATUS";
// PENDING	Order is created but not processed yet
// PROCESSING	Staff is preparing the order or tickets
// COMPLETED	Order is finished and paid
// CANCELED	Order was canceled
// REFUNDED	Payment returned to customer

    public Cinema(String cinemaName, String address) {
        this.cinemaName = cinemaName;
        this.address = address;
        this.staffs = new ArrayList<>();
        this.Customers = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.orders = new ArrayList<>();

    }


    public String getCinemaName() {
        return "Name: " + cinemaName;
    }

    public String getAddress() {
        return "=========== Location =============" + address + "\n=================================";
    }

    public String getStaffs() {
        return "Currently working!";
    }

    public String getCustomers() {
        return "Currently working!";
    }

    public String getTickets() {
        return "Currently working!";
    }

    public void addTicket(String name, int qty, double price) {

    }

    public void displayAllTicket() {

    }

    public void createStaff(Staff staff) {
        staffs.add(staff);
    }

    public void createCustomer(Customer customer) {

    }

    public void createMenuItem(Ticket ticket) {
        tickets.add(ticket);
    }

    public void createMenuAvailibility() {
    }

    public void createOrder() {

    }

    public void viewCustomers() {

    }

    public void viewOrders() {
    }

    public void updateOrderStatus() {
    }


    public void checkPermission() {
            System.out.println(staffs.size());
        for (Staff s : staffs) {
            System.out.println(s.getUsername() + " can CREATE_ORDER? " + s.can(Cinema.CREATE_ORDER));
            System.out.println(s.getUsername() + " can VIEW_ORDER? " + s.can(Cinema.VIEW_ORDERS));
            System.out.println(s.getUsername() + " can CREATE_MENU_ITEM?? " + s.can(Cinema.CREATE_MENU_ITEM))
            ;
        }
    }
}
