package practice.practicetwo;

import java. util. ArrayList;
import java. util. List;
import java. util. Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("SpartaBurger", 5900, "Sparta의 대표 메뉴"));
        menuItems.add(new MenuItem("DoubleSpartaBurger", 7900, "패티가 두 장 들어간 Sparta 버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6900, "치즈가 들어간 버거"));
        menuItems.add(new MenuItem("HamBurger", 3900, "가장 기본이 되는 버거"));

        Scanner sc = new Scanner(System.in);

        //List를 사용했을때는 메서드를 호출해서 사용하자
        // 변수가 menuItems이면서 .을 사용해 크기는 length가 아닌 size를 호출
        // []에 i를 넣는것이 아닌 .으로 get을 호출해서 i를 넣기
        // .을 잘 활용하기 - menuItems라는 변수에 get을 호출하여 다시 그 안 객체에서 name을 불러오기
        // .후 호출 가능한 것을 보긷위해서 Ctrl + Space를 활용하자
        for (int i =0; i < menuItems.size(); i++) {
            System.out.println((i+1) + ". " + menuItems.get(i).name);
        }
        System.out.println("0. 종료");
        System.out.println("");

        int choice = 5;

        while (!(choice == 0)) {
            System.out.print("메뉴를 선택하세요. : ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println(menuItems.get(0).name + "를 선택하셨습니다. 가격은 " + menuItems.get(0).price + "원 - " + menuItems.get(0).explanation);
            } else if (choice == 2) {
                System.out.println(menuItems.get(1).name + "를 선택하셨습니다. 가격은 " + menuItems.get(1).price + "원 - " + menuItems.get(1).explanation);
            } else if (choice == 3) {
                System.out.println(menuItems.get(2).name + "를 선택하셨습니다. 가격은 " + menuItems.get(2).price + "원 - " + menuItems.get(2).explanation);
            } else if (choice == 4) {
                System.out.println(menuItems.get(3).name + "를 선택하셨습니다. 가격은 " + menuItems.get(3).price + "원 - " + menuItems.get(3).explanation);
            } else if (choice == 0) {
                System.out.println("선택을 종료합니다.");
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}


