package user;

public interface IStaff { //this is the parents

    String getStaffId();

    String getUsername();

    boolean isActive();

    boolean checkPassword(String input);

    String getFullName();

    boolean can(String action);
}
