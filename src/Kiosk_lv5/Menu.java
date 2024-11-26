package Kiosk_lv5;

import Kiosk_lv4.MenuItems;

import java.util.List;
import java.util.ArrayList;

public class Menu {
    private String categoryName;  // 카테고리 이름
    private List<MenuItems> menuItems;  // 메뉴 항목 리스트

    // 생성자
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();  // 메뉴 항목 리스트 초기화
    }

    // 메뉴 항목 추가 메서드
    public void addItem(MenuItems item) {
        menuItems.add(item);  // menuItems 리스트에 item 추가
    }

    // 카테고리 이름을 반환하는 메서드
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목 리스트 반환
    public List<MenuItems> getMenuItems() {
        return menuItems;
    }

    // 메뉴 항목들을 출력하는 메서드
    public void displayItems() {
        int index = 1;
        for (MenuItems item : menuItems) {
            // 설명을 추가한 출력 형식
            System.out.println(index++ + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }
        System.out.println("0. 뒤로가기");
    }
}
