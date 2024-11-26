package Kiosk.example;

public class MenuItems {
    private String name;
    private double price;
    private String description;

    public MenuItems(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter 메서드들
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
