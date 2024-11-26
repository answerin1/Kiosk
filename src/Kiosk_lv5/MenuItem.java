package Kiosk_lv5;

public class MenuItem {
    private String name; // 메뉴 이름
    private int price; // 가격
    private String description; // 설명

    // 생성자
    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter 메서드들
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
