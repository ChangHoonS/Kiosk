package practice.practicefour;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MenuItem> burgers = new ArrayList<>();
        burgers.add(new MenuItem("SpartaBurger", 5900, "Sparta의 대표 메뉴"));
        burgers.add(new MenuItem("DoubleSpartaBurger", 7900, "패티가 두 장 들어간 Sparta 버거"));
        burgers.add(new MenuItem("CheeseBurger", 6900, "치즈가 들어간 버거"));
        burgers.add(new MenuItem("HamBurger", 3900, "가장 기본이 되는 버거"));

        List<MenuItem> setMenu = new ArrayList<>();
        setMenu.add(new MenuItem("SpartaBurger Set", 7900, "Sparta의 대표 메뉴 SpartaBurger의 세트 메뉴"));
        setMenu.add(new MenuItem("DoubleSpartaBurger Set", 9900, "패티가 두 장 들어간 Sparta 버거의 세트 메뉴"));
        setMenu.add(new MenuItem("CheeseBurger Set", 8900, "치즈가 들어간 버거의 세트 메뉴"));
        setMenu.add(new MenuItem("HamBurger Set", 5900, "가장 기본이 되는 버거의 세트 메뉴"));

        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("Cola", 1900, "톡 쏘는 콜라"));
        drinks.add(new MenuItem("Cider", 1900, "톡 쏘는 사이다"));
        drinks.add(new MenuItem("Zero Cola", 2300, "Kcal가 0인 콜라"));
        drinks.add(new MenuItem("Milk Shake", 2900, "부드러운 밀크 쉐이크"));

        List<MenuItem> sides = new ArrayList<>();
        sides.add(new MenuItem("French fries", 1900, "따듯하고 맛난 감자튀김"));
        sides.add(new MenuItem("Cheese stick", 2500, "모짜렐라 치즈가 들어간 치즈스틱"));
        sides.add(new MenuItem("Cheese ball", 2500, "모짜렐라 치즈가 들어간 치즈볼"));
        sides.add(new MenuItem("Onion ring", 2300, "신선한 양파와 함께 튀긴 어니언링"));

        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("Burgers", burgers));
        menu.add(new Menu("Burger Set", setMenu));
        menu.add(new Menu("Drinks", drinks));
        menu.add(new Menu("Sides", sides));

        // System.out.println(menu.get(3).menuItems.get(2).name); chees ball

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}

// Menu 객체 생성하면서 카테고리 이름 설정
// Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입

// Kiosk 객체 생성
// Kiosk 내 시작하는 함수 호출