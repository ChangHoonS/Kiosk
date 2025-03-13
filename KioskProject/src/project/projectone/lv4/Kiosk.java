package project.projectone.lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<Menu> menu;

    Scanner sc = new Scanner(System.in);

    Kiosk(List<Menu> menu) {
        this.menu = menu;

    }

    public void start() {

        int choice;
        int choicetwo;
        boolean flag = true;

        while (flag) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).categoryName);
            }
            System.out.println("0. 종료");
            System.out.println("");

            System.out.print("카테고리를 선택하세요. : ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice > 0 && choice <= menu.get(choice - 1).menuItems.size()) {
                System.out.println("[ " + menu.get(choice - 1).categoryName + " MENU ]");
                for (int i = 1; i <= menu.get(choice - 1).menuItems.size(); i++) {
                    System.out.println(i + ". " + menu.get(choice - 1).menuItems.get(i - 1).name + " | W " + menu.get(choice - 1).menuItems.get(i - 1).price + " | " + menu.get(choice - 1).menuItems.get(i - 1).explanation);
                }
                System.out.println("0. 뒤로가기");
                System.out.println("");
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다");
                flag = false;
                break;
            } else {
                System.out.println("잘못된 입렵입니다.");
            }
            while (true) {
                System.out.print("메뉴를 선택하세요. : ");
                choicetwo = sc.nextInt();
                if (choicetwo > 0 && choicetwo <= menu.get(choicetwo - 1).menuItems.size()) {
                    System.out.println("선택한 메뉴 : " + menu.get(choice - 1).menuItems.get(choicetwo - 1).name + " | W " + menu.get(choice - 1).menuItems.get(choicetwo - 1).price + " | " + menu.get(choice - 1).menuItems.get(choicetwo - 1).explanation);
                    System.out.println("");
                    break;
                } else if (choicetwo == 0) {
                    System.out.println("카테고리 선택으로 돌아갑니다.");
                    System.out.println("");
                    break;
                } else {
                    System.out.println("잘못된 선택입니다.");
                    System.out.println("");
                }
            }

        }
    }
}
