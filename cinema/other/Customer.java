package other;

public class Customer {

    private int id;
    private int age;
    private String fullName;
    private String username;
    private String email;
    private String password;
    private boolean isOnline;

    public Customer(String fullName, int age, int id, String email, String username, String password, boolean isOnline) {

        setFullName(fullName);
        setUsername(username);
        setAge(age);
        setEmail(email);
        setPassword(password);
        this.id = id;
        this.isOnline = isOnline;
    }

    //Getters
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //methods
    public void getPassword() {
    }

    public void changePassword() {
    }

    public void checkEmail() {
    }

    public void changeEmail() {
    }

    public void paymentOption() {
        getId();
        getPassword();
    }

    public void setActive(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public void getCustomerService() {

    }

}
