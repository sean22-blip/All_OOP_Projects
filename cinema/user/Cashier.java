package user;

import controller.Cinema;
public class Cashier extends Staff {
    public Cashier(String fullName, int age, String id, String userName, String password, String email, String position, double salary, boolean isActive) {
        super(fullName, age, id, userName, password, email, position, salary, isActive);
        System.out.println("3) Cashier is being created from Constructor!");
    }


    @Override
    public boolean can(String action) {
        return action.equals(Cinema.CREATE_ORDER)
                || action.equals(Cinema.VIEW_ORDERS)
                || action.equals(Cinema.VIEW_CUSTOMERS)
                || action.equals(Cinema.UPDATE_ORDER_STATUS);
    }//override meeans the child in this case cashier is providing its own method 
    //with the same name and thee same parameter as the parent aka Staff

}
