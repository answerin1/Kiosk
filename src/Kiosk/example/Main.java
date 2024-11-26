package Kiosk.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MenuItems> list = new ArrayList<>();

        list.add(new MenuItems("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        list.add(new MenuItems("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        list.add(new MenuItems("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        list.add(new MenuItems("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Kiosk 객체 생성, 메뉴 리스트를 넘겨주고 start() 실행
        Kiosk kiosk = new Kiosk(list);
        kiosk.start();  // Kiosk의 start() 메서드 호출
    }
}
