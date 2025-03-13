package practice.practicefour;

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


//            for (int i = 1; i <= menu.size(); i++) {
//                if (choice == i) {
//                    System.out.println("[ " + menu.get(choice - 1).categoryName + " MENU ]");
//                    for (int j = 1; j <= burgers.size(); j++) {
//                        System.out.println(j + ". " + menu.get(j-1).menuItems.get(j-1).name + " | W " + menu.get(j-1).menuItems.get(j-1).price + " | " + menu.get(j-1).menuItems.get(j-1)..explanation);
//                    }
//                    System.out.println("0. 뒤로가기");
//                    System.out.println("");
//
//                    while (true) {
//                        System.out.print("메뉴를 선택하세요. : ");
//                        choice = sc.nextInt();
//                        if (choice > 0 && choice <= burgers.size()) {
//                            System.out.println("선택한 메뉴 : " + burgers.get(choice - 1).name + " | W " + burgers.get(choice - 1).price + " | " + burgers.get(choice - 1).explanation);
//                            System.out.println("");
//                            break;
//                        } else if (choice == 0) {
//                            System.out.println("카테고리 선택으로 돌아갑니다.");
//                            System.out.println("");
//                            break;
//                        } else {
//                            System.out.println("잘못된 선택입니다.");
//                            System.out.println("");
//                        }
//                    }
//                } else if (choice == 2) {
//                    System.out.println("[ " + menu.get(choice - 1).categoryName + " MENU ]");
//                    for (int j = 1; j <= setMenu.size(); j++) {
//                        System.out.println(j + ". " + setMenu.get(j - 1).name + " | W " + setMenu.get(j - 1).price + " | " + setMenu.get(j - 1).explanation);
//                    }
//                    System.out.println("0. 뒤로가기");
//                    System.out.println("");
//
//                    while (true) {
//                        System.out.print("메뉴를 선택하세요. : ");
//                        choice = sc.nextInt();
//                        if (choice > 0 && choice <= setMenu.size()) {
//                            System.out.println("선택한 메뉴 : " + setMenu.get(choice - 1).name + " | W " + setMenu.get(choice - 1).price + " | " + setMenu.get(choice - 1).explanation);
//                            System.out.println("");
//                            break;
//                        } else if (choice == 0) {
//                            System.out.println("카테고리 선택으로 돌아갑니다.");
//                            System.out.println("");
//                            break;
//                        } else {
//                            System.out.println("잘못된 선택입니다.");
//                            System.out.println("");
//                        }
//                    }
//                } else if (choice == 3) {
//                    System.out.println("[ " + menu.get(choice - 1).categoryName + " MENU ]");
//                    for (int j = 1; j <= drinks.size(); j++) {
//                        System.out.println(j + ". " + drinks.get(j - 1).name + " | W " + drinks.get(j - 1).price + " | " + drinks.get(j - 1).explanation);
//                    }
//                    System.out.println("0. 뒤로가기");
//                    System.out.println("");
//
//                    while (true) {
//                        System.out.print("메뉴를 선택하세요. : ");
//                        choice = sc.nextInt();
//                        if (choice > 0 && choice <= drinks.size()) {
//                            System.out.println("선택한 메뉴 : " + drinks.get(choice - 1).name + " | W " + drinks.get(choice - 1).price + " | " + drinks.get(choice - 1).explanation);
//                            System.out.println("");
//                            break;
//                        } else if (choice == 0) {
//                            System.out.println("카테고리 선택으로 돌아갑니다.");
//                            System.out.println("");
//                            break;
//                        } else {
//                            System.out.println("잘못된 선택입니다.");
//                            System.out.println("");
//                        }
//                    }
//                } else if (choice == 4) {
//                    System.out.println("[ " + menu.get(choice - 1).categoryName + " MENU ]");
//                    for (int j = 1; j <= sides.size(); j++) {
//                        System.out.println(j + ". " + sides.get(j - 1).name + " | W " + sides.get(j - 1).price + " | " + sides.get(j - 1).explanation);
//                    }
//                    System.out.println("0. 뒤로가기");
//                    System.out.println("");
//
//                    while (true) {
//                        System.out.print("메뉴를 선택하세요. : ");
//                        choice = sc.nextInt();
//                          if (choice > 0 && choice <= sides.size()) {
//                            System.out.println("선택한 메뉴 : " + sides.get(choice - 1).name + " | W " + sides.get(choice - 1).price + " | " + sides.get(choice - 1).explanation);
//                            System.out.println("");
//                            break;
//                        } else if (choice == 0) {
//                            System.out.println("카테고리 선택으로 돌아갑니다.");
//                            System.out.println("");
//                            break;
//                        } else {
//                            System.out.println("잘못된 선택입니다.");
//                            System.out.println("");
//                        }
//                    }
//                } else if (choice == 0) {
//                    System.out.println("프로그램을 종료합니다");
//                    flag = false;
//                    break;
//                } else {
//                    System.out.println("잘못된 입렵입니다.");
//                }
//                break;
//            }
        }
    }
}


// System.out.println(menu.get(3).menuItems.get(2).name); chees ball


// 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
// List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?

// Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력

// 숫자 입력 받기
// 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
// menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.


// System.out.println(menu.get(choice - 1).categoryName + "를 선택하셨습니다.");

//else if (choice == 0) {
//        System.out.println("선택을 종료합니다.");
//            } else {
//                    System.out.println("잘못된 선택입니다.");


//start() {

// List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력

// 숫자 입력 받기

// 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
// List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?

// Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력

// 숫자 입력 받기
// 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
// menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.


//        System.out.println("");
//        System.out.print("메뉴를 선택하세요. : ");
//        choice = sc.nextInt();
//        sc.nextLine();
//        if (choice > 0 && choice <= menu.size()) {
//            System.out.println(menuItems.get(choice - 1).name + "를 선택하셨습니다. 가격은 " + menuItems.get(choice - 1).price + "원 - " + menuItems.get(choice - 1).explanation);
//        } else if (choice == 0) {
//            System.out.println("선택을 종료합니다.");
//            flag = false;
//        } else {
//            System.out.println("잘못된 선택입니다.");
//        }

//List<MenuItem> burgers;
//List<MenuItem> setMenu;
//List<MenuItem> drinks;
//List<MenuItem> sides;