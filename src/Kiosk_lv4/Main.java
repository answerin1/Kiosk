package Kiosk_lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 예시로 메뉴 항목 생성
        List<Menu> menus = new ArrayList<>();

        // 각 카테고리별 메뉴 생성
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addItem(new MenuItems("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItems("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItems("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItems("Hamburger",5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addItem(new MenuItems("Coke", 1.5, "톡톡 쏘는 콜라"));
        drinkMenu.addItem(new MenuItems("Sprite", 1.5, "입안 가득 탄산 사이다"));

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addItem(new MenuItems("Vanilla Ice Cream", 2.0, "시원하고 크리미한 바닐라 아이스크림"));
        dessertMenu.addItem(new MenuItems("Chocolate Cake", 4.5, "맛있는 초콜릿 케이크"));
        dessertMenu.addItem(new MenuItems("Strawberry Cake", 5.2, "생딸기 가득한 딸기 케이크"));

        // 메뉴 카테고리 리스트에 추가
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();  // 프로그램 시작
    }
}
