
package Library_Managment_System.controller;

import java.util.ArrayList;
// import Library_Managment_System.other.*;

import Library_Managment_System.other.Customer;
import Library_Managment_System.other.InventoryOfBooks;
import Library_Managment_System.user.Staff;

public class Library {
    String libraryName, address;
    double totalIncome = 0.00;


    public static final String CREATE_STAFF = "CREATE_STAFF";
    public static final String CREATE_CUSTOMER = "CREATE_CUSTOMER";
    public static final String CREATE_MENU_ITEM = "CREATE_MENU_ITEM";
    public static final String SET_MENU_AVAILABILITY = "CREATE_MENU_AVAILIBILITY";
    public static final String CREATE_ORDER = "CREATE_ORDER";
    public static final String VIEW_CUSTOMERS = "VIEW_CUSTOMERS";
    public static final String VIEW_ORDERS = "VIEW_ORDERS";
    public static final String UPDATE_ORDER_STATUS = "UPDATE_ORDER_STATUS";

    ArrayList<Staff> staffs = new ArrayList<>();
    ArrayList<InventoryOfBooks> books = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();

    protected void createStaff(){  };
    protected void createCustomer(){};
    protected void createMenuItem(){};
    protected void createOrder(){};
    protected void setMenuAvailabilty(){};
    protected void viewCustomers(){};
    protected void viewOrders(){};
    protected void updateOrderStatus(){};
    protected void existingStaffData(){
    }
    

}