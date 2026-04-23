package controller;

import user.Cashier;
import user.ManagerStaff;

public class MainCinema {

    public static void main(String[] args) {
        Cinema cinemaShop = new Cinema("Seanima", "\nStreet: 742 Evergreen Terrace\nCity: Springfield\nState: Illinois \nZIP Code: 62704\nCountry: United States");

        Cashier cashier = new Cashier(
                "John Smith", // fullName
                28, // age
                "101", // id
                "jsmith", // userName
                "pass123", // password
                "john@email.com", // email
                "Cashier", // position
                1500.00, // salary
                true // isActive
        );
        ManagerStaff manager = new ManagerStaff(
                "Sarah Johnson", // fullName
                35, // age
                "20", // id
                "sjohnson", // userName
                "manager456", // password
                "sarah@email.com", // email
                "Manager", // position
                3000.00, // salary
                true // isActive
        );
        cinemaShop.checkPermission();
    }
}
