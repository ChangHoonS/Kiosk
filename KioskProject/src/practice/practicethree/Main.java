package practice.practicethree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("SpartaBurger", 5900, "Sparta의 대표 메뉴"));
        menuItems.add(new MenuItem("DoubleSpartaBurger", 7900, "패티가 두 장 들어간 Sparta 버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6900, "치즈가 들어간 버거"));
        menuItems.add(new MenuItem("HamBurger", 3900, "가장 기본이 되는 버거"));
        // 객체를 생성할 때 값을 념겨주는 부분

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}
