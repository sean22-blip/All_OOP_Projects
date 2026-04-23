package user;

import controller.Cinema;

public class ManagerStaff extends Staff{

    public ManagerStaff(String fullName, int age, String id, String userName, String password, String email, String position, double salary, boolean isActive) {
        super(fullName, age, id, userName, password, email, position, salary, isActive);
        System.out.println("2) ManagerStaff constructor!");
    }

    @Override
    public boolean can(String action) {
        return action.equals(Cinema.VIEW_CUSTOMERS)
                || action.equals(Cinema.VIEW_ORDERS)
                || action.equals(Cinema.CREATE_STAFF)
                || action.equals(Cinema.CREATE_MENU_ITEM)
                || action.equals(Cinema.UPDATE_ORDER_STATUS);

    }
    //override is providing its own speical method with the same namee as Staff
    //with the same parameters
}
