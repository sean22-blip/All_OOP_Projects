package Library_Managment_System.other;

import java.io.IOException;
import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private String fullName, username, customerId, address, password, phone;
    private int age;

    public Customer(String fullName, String username, String staffId, String address, String password, String phone,
            int age) {
        this.fullName = fullName;
        this.username = username;
        this.customerId = staffId;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.age = age;
    }

    private void getTotal() {
        try {
            System.out.println("Enter order id:");
            customerId = scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong order format!!");
        }
    }
}
