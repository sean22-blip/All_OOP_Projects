package other;

public class Ticket {
    private String name;
    private int id;
    private double price;
    private boolean isavailale;
    private int qty;

    public Ticket(int id, String name, double price, boolean isavailable, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isavailale = isavailable;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket [name=" + name + ", price=" + price + ", isavailale=" + isavailale + "]";
    }

}
