package Library_Managment_System.user;

public abstract class Staff implements Istaff {
    private String fullName, username, staffId, address, password, phone;
    private int age;
    private double height, salary;// height is measured in meters
    private boolean isActive;

        @Override
    public abstract boolean can(String action);


    public Staff(String fullName, String id, String address, String password, int age, int phone, double height,
        double salary) {
        setFullName(fullName);
        setUsername(username);
        setStaffId(id);
        setAddress(address);
        setPassword(password);
        setPhone(password);
        setAge(age);
        setHeight(height);
        checkPassword(password);
        this.isActive = true;
    }
    public String getFullName() {return fullName;}
    public String getUsername() {return username;}
    public String getStaffId() {return staffId;}
    public String getAddress() {return address;}
    public String getPassword() {return password;}
    public String getPhone() {return phone;}
    public int getAge() {return age;}
    public double getHeight() {return height;}
    public double getSalary() {return salary;}
    public boolean isActive() {return isActive;}                             
    protected void setFullName(String fullName) {
        this.fullName = fullName;
    }



    protected void setUsername(String username) {
        this.username = username;
    }



    protected void setStaffId(String staffId) {
        this.staffId = staffId;
    }



    protected void setAddress(String address) {
        this.address = address;
    }



    protected void setPassword(String password) {
        this.password = password;
    }



    protected void setPhone(String phone) {
        this.phone = phone;
    }



    protected void setAge(int age) {
        this.age = age;
    }



    protected void setHeight(double height) {
        this.height = height;
    }



    // handle login
    public boolean checkPassword(String input) {
        return password != null && password.equals(input);
    }

}
