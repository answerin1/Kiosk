package Kiosk_lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menuCategories;  // 메뉴 카테고리 리스트

    public Kiosk(List<Menu> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");

            // 카테고리별로 메뉴 항목 표시
            int index = 1;
            for (Menu menu : menuCategories) {
                System.out.println(index++ + ". " + menu.getCategoryName());
            }

            System.out.println("0. 종료      | 종료");

            System.out.print("메뉴 번호를 입력하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= menuCategories.size()) {
                Menu selectedMenu = menuCategories.get(choice - 1);

                // 선택한 카테고리의 메뉴 항목 표시
                selectedMenu.displayItems();

                // 메뉴 항목 선택
                while (true) {
                    System.out.print("항목 번호를 입력하세요: ");
                    int itemChoice = scanner.nextInt();

                    if (itemChoice == 0) {
                        break;  // "0"을 입력하면 뒤로가기, 즉 카테고리 메뉴로 돌아감
                    } else if (itemChoice >= 1 && itemChoice <= selectedMenu.getMenuItems().size()) {
                        // 선택된 메뉴 항목을 MenuItem 객체로 가져옴
                        MenuItems selectedItem = selectedMenu.getMenuItems().get(itemChoice - 1);
                        System.out.println("선택한 메뉴: " + selectedItem.getName());
                        System.out.println("가격: W " + selectedItem.getPrice());
                        System.out.println("설명: " + selectedItem.getDescription());
                    } else {
                        System.out.println("잘못된 항목 번호입니다.");
                    }
                }
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }
}
