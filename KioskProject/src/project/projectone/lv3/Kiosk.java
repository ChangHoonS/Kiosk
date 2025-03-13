package project.projectone.lv3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// main함수에서 관리하던 전체 순서 제어를 Kiosk 클래스로 관리
public class Kiosk {

    // MenuItem을 관리하는 리스트 필드로 존재
    List<MenuItem> menuItems = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // 생성자 부분 - Kiosk 클래스 생성자로 값을 할당
    // 반환 자료형은 MenuItem만이 아닌 List<MenuItem>까지 모두 넣어줘야 한다
    Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 입력과 반복문 로직은 start 함수로 관리
    public void start() {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).name);
        }
        System.out.println("0. 종료");
        System.out.println("");

        int choice;
        // 처음 while문 조건 int choice = 5;

        // 새로 배운 보편적인 while문 조건 boolean flag = true;
        boolean flag = true;

        // Main에서 메뉴리스트를 늘려도 정상 작동
        while (flag) {
            System.out.print("메뉴를 선택하세요. : ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice > 0 && choice <= menuItems.size()) {
                System.out.println(menuItems.get(choice - 1).name + "를 선택하셨습니다. 가격은 " + menuItems.get(choice - 1).price + "원 - " + menuItems.get(choice - 1).explanation);
            } else if (choice == 0) {
                System.out.println("선택을 종료합니다.");
                flag = false;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }

    }
}

// if문의 길이가 길어지고 새로운 리스트가 들어가도 자동으로 실행가능 하도록 짜기위해 주석처리

//while (flag) {
//        System.out.print("메뉴를 선택하세요. : ");
//        choice = sc.nextInt();
//            sc.nextLine();
//            if (choice == 1) {
//        System.out.println(menuItems.get(0).name + "를 선택하셨습니다. 가격은 " + menuItems.get(0).price + "원 - " + menuItems.get(0).explanation);
//        } else if (choice == 2) {
//        System.out.println(menuItems.get(1).name + "를 선택하셨습니다. 가격은 " + menuItems.get(1).price + "원 - " + menuItems.get(1).explanation);
//        } else if (choice == 3) {
//        System.out.println(menuItems.get(2).name + "를 선택하셨습니다. 가격은 " + menuItems.get(2).price + "원 - " + menuItems.get(2).explanation);
//        } else if (choice == 4) {
//        System.out.println(menuItems.get(3).name + "를 선택하셨습니다. 가격은 " + menuItems.get(3).price + "원 - " + menuItems.get(3).explanation);
//        } else if (choice == 0) {
//        System.out.println("선택을 종료합니다.");
//        flag = false; // 반복문 조건 탈출 시 flag 할당을 바꿔 반복문 탈출
//        } else {
//        System.out.println("잘못된 선택입니다.");
//            }
//                    }


// 윗 과정을 줄이고 실행가능하도록 만들다 만들어진 실패 결과물

//            for (int i = 1; i <= menuItems.size(); i++) {
//                if (choice == i) {
//                    System.out.println(menuItems.get(i - 1).name + "를 선택하셨습니다. 가격은 " + menuItems.get(i - 1).price + "원 - " + menuItems.get(i - 1).explanation);
//                } else if (choice == 0) {
//                    System.out.println("선택을 종료합니다.");
//                    flag = false;
//                } else {
//                    System.out.println("잘못된 선택입니다.");
//                }
//            }
