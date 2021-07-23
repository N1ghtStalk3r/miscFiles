package com.warehouse.menu;

import java.util.Scanner;

public class MenuLauncher {
    public static void main(String[] args) {
        /*Запуск меню*/
        new MenuItems(new Scanner(System.in)).startMainMenu();

    }
}
