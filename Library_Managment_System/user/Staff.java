public abstract class Staff implements Istaff {
    private String fullName, username, staffId, address, password, phone;
    private int age;
    private double height, salary;// height is measured in meters
    private boolean isActive;

        @Override
    public abstract boolean can(String action);


    public Staff(String fullName, String id, String address, String password, int age, int phone, double height,
        double salary) {
        // === we do not need this because we do not want generic staff like Staff s1 = new Staff(); ====
        // this.salary = salary;
        // this.fullName = fullName;
        // this.staffId = staffId;
        // this.address = address;
        // this.password = password;
        // this.age = age;
        // this.phone = phone;
        // this.height = height;
        setFullName(fullName);
        setUsername(username);
        setStaffId(id);
        // setSalary(salary);
        setAddress(address);
        setPassword(password);
        setPhone(password);
        setAge(age);
        setHeight(height);
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
            

  
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public void setUsername(String username) {
        this.username = username;
    }



    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public void setHeight(double height) {
        this.height = height;
    }



    // handle login
    public boolean checkPassword(String input) {
        return password != null && password.equals(input);
    }

}
