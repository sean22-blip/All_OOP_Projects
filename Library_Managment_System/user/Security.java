package Library_Managment_System.user;
import user.Staff;

public class Security extends Staff {
public Security(String fullName, int age, String id, String userName, String password, String email, String position,
            double salary, boolean isActive) {
        super(fullName, age, id, userName, password, email, position, salary, isActive);
    }

@Override
public boolean can(String action){
    return false;
}
}
