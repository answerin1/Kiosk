package Kiosk_lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;  // 카테고리 이름
    private List<MenuItems> items; // 메뉴 항목들

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void addItem(MenuItems item) {
        items.add(item);
    }

    public List<MenuItems> getMenuItems() {
        return items;  // 메뉴 항목 리스트 반환
    }

    public void displayItems() {
        System.out.println("[ " + categoryName + " MENU ]");
        int index = 1;
        for (MenuItems item : items) {
            System.out.println(index++ + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }
        System.out.println("0. 뒤로가기");
    }
}
