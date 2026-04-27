package Library_Managment_System.user;
public interface Istaff {
//each staff must provide its own version can action to know what each staff is eligble to do
String getStaffId();
String getUsername();
boolean isActive();
boolean checkPassword(String input);
String getFullName();

public abstract boolean can(String action);
}
