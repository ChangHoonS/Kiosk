package project.projectone.lv1;

import java. util. Scanner;

public class Lv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 사뇽

        int choice = 5;

        //햄버거 메뉴 표시
        System.out.println("[SPARTA MENU]");
        System.out.println("1. SpartaBurger       | W 5.9 | Sparta의 대표 메뉴");
        System.out.println("2. DoubleSpartaBurger | W 7.9 | 패티가 두 장 들어간 Sparta 버거");
        System.out.println("3. CheeseBurger       | W 6.9 | 치즈가 들어간 버거");
        System.out.println("4. HamBurger          | W 3.9 | 가장 기본이 되는 버거");
        System.out.println("0. 종료");
        System.out.println(""); // 줄 띄우기 공백

        // 반복문을 이용 및 특정 번호 입력시 프로그램 종료
        while (!(choice == 0)) {
            System.out.print("메뉴를 선택하세요. : ");
            choice = sc.nextInt(); // 스캐너로 숫자를 입력 받기
            sc.nextLine();
            // 조건문으로 입력받은 숫자에 따라 다른 로직 실행
            if (choice == 1) {
                System.out.println("SpartaBurger를 선택하셨습니다.");
            } else if (choice == 2) {
                System.out.println("DoubleSpartaBurger를 선택하셨습니다.");
            } else if (choice == 3) {
                System.out.println("CheeseBurger를 선택하셨습니다.");
            } else if (choice == 4) {
                System.out.println("HamBurger를 선택하셨습니다.");
            } else if (choice == 0) {
                System.out.println("선택을 종료합니다.");
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
