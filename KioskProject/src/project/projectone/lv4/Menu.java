package project.projectone.lv4;

import java.util.List;

public class Menu {

    String categoryName;
    List<MenuItem> menuItems;

    Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }
}