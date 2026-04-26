public class Manager extends Staff {
    private Double bonus ;
@Override 
public boolean can(String action){
    return false;
}
    public Manager(String fullName, String username, String id, String address, String password, int age, int phone,
            double height, double salary) {
        super(fullName, username, id, address, password, age, phone, height, salary);
         setFullName(fullName);
        setUsername(username);
        setStaffId(id);
        setAddress(address);
        setPassword(password);
        setPhone(password);
        setAge(age);
        setHeight(height);
    }


   
}
