package com.warehouse;

import com.warehouse.menu.MenuItems;

import java.util.Scanner;

public class MenuLauncher {
    public static void main(String[] args) {
        /*Запуск меню*/
        new MenuItems(new Scanner(System.in)).startMainMenu();

    }
}
