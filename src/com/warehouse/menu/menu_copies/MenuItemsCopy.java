package com.warehouse.menu.menu_copies;

import java.util.Scanner;

class MenuItemsCopy {
    private final Scanner scanner;

    /*Пункты меню*/
        /*Главное меню*/
    private final String MainMenuHead = "\t\tГлавное меню";
    private final String MainMenuEntry_1 = "1. Записи о поставках в склад";
    private final String MainMenuEntry_2 = "2. Записи о поставках из склада физ. лицам";
    private final String MainMenuEntry_3 = "3. Записи о поставках из склада юр. лицам";
    private final String MainMenuEntry_4 = "4. Ассортимент стройматериалов";
    private final String MainMenuEntry_5 = "5. Выход из приложения";
        /*Подменю 1. Поставки в склад*/
    private final String SubMenuEntry_1_Head = "\t\t1. Записи о поставках в склад";
    private final String SubMenuEntry_1_1 = "1.1. Просмотр записей о поставках в склад";
    private final String SubMenuEntry_1_2 = "1.2. Редактирование записей о поставках в склад";
        /*Подменю 2. Поставки физ. лицам*/
    private final String SubMenuEntry_2_Head = "\t\t2. Записи о поставках из склада физ. лицам";
    private final String SubMenuEntry_2_1 = "2.1. Просмотр записей о поставках физ. лицам";
    private final String SubMenuEntry_2_2 = "2.2. Редактирование записей о поставках физ. лицам";
        /*Подменю 3. Поставки юр. лицам*/
    private final String SubMenuEntry_3_Head = "\t\t3. Записи о поставках из склада юр. лицам";
    private final String SubMenuEntry_3_1 = "3.1. Просмотр записей о поставках юр. лицам";
    private final String SubMenuEntry_3_2 = "3.2. Редактирование записей о поставках юр. лицам";
        /*Подменю 4. Ассортимент*/
    private final String SubMenuEntry_4_Head = "\t\t4. Ассортимент стройматериалов";
    private final String SubMenuEntry_4_1 = "4.1. Просмотр записей ассортимента";
    private final String SubMenuEntry_4_2 = "4.2. Редактирование записей ассортимента";

    public MenuItemsCopy(Scanner scanner) {
        this.scanner = scanner;
    }

    /*Меню*/
        /*Главное меню*/
    private void printMainMenu() {
        System.out.println(MainMenuHead);
        System.out.println(MainMenuEntry_1);
        System.out.println(MainMenuEntry_2);
        System.out.println(MainMenuEntry_3);
        System.out.println(MainMenuEntry_4);
        System.out.println(MainMenuEntry_5);
    }
        /*Подменю 1. Поставки в склад*/
    private void printSubMenu_1(){
        System.out.println(SubMenuEntry_1_Head);
        System.out.println(SubMenuEntry_1_1);
        System.out.println(SubMenuEntry_1_2);
    }
        /*Подменю 2. Поставки физ. лицам*/
    private void printSubMenu_2(){
        System.out.println(SubMenuEntry_2_Head);
        System.out.println(SubMenuEntry_2_1);
        System.out.println(SubMenuEntry_2_2);
    }
        /*Подменю 3. Поставки юр. лицам*/
    private void printSubMenu_3(){
        System.out.println(SubMenuEntry_3_Head);
        System.out.println(SubMenuEntry_3_1);
        System.out.println(SubMenuEntry_3_2);
    }
        /*Подменю 4. Ассортимент*/
    private void printSubMenu_4(){
        System.out.println(SubMenuEntry_4_Head);
        System.out.println(SubMenuEntry_4_1);
        System.out.println(SubMenuEntry_4_2);
    }
    public void startMainMenu() {
        if (this.scanner != null) {
            int key;
            do {
                printMainMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("Заглушка");
                        printSubMenu_1();
                        break;
                    case 2:
                        System.out.println("Заглушка");
                        printSubMenu_2();
                        break;
                    case 3:
                        System.out.println("Заглушка");
                        printSubMenu_3();
                        break;
                    case 4:
                        System.out.println("Заглушка");
                        printSubMenu_4();
                        break;
                    case 5:
                        System.out.println("Выход");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");

                }
            } while (key != 5);
        }
    }
}
