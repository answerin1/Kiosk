package Kiosk.example;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItems> list;

    public Kiosk(List<MenuItems> list) {
        this.list = list;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            int index = 1;
            for (MenuItems item : list) {
                System.out.println(index++ + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }

            System.out.println("0. 종료      | 종료");

            System.out.print("메뉴 번호를 입력하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= list.size()) {
                MenuItems selectedItem = list.get(choice - 1);
                System.out.println(selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }
}
