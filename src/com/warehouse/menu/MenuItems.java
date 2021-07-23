package com.warehouse.menu;

import com.warehouse.notes.postavki_FZ.Postavshiki_FZ_Ser;
import com.warehouse.notes.postavki_UR.Postavshiki_UR_Ser;
import com.warehouse.notes.postavki_v_sklad.Postavshiki_V_Sklad_Ser;

import java.util.Scanner;

public class MenuItems {
    private final Scanner scanner;

    /*Пункты меню*/
        /*Главное меню*/
    private final String MainMenuHead = "\t\tГлавное меню";
    private final String MainMenuEntry_1 = "1. Записи о поставках в склад";
    private final String MainMenuEntry_2 = "2. Записи о поставках из склада физ. лицам";
    private final String MainMenuEntry_3 = "3. Записи о поставках из склада юр. лицам";
    private final String MainMenuEntry_4 = "4. Ассортимент стройматериалов";
    private final String MainMenuEntry_5 = "5. Выход из приложения";
        /*Назад в главное меню*/
    private final String backToMainMenu = "В главное меню";
        /*Выход из программы*/
        private final String appExit = "Выход из приложения";
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

    public MenuItems(Scanner scanner) {
        this.scanner = scanner;
    }

    /*Показ меню*/
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
    private void printSubMenu_1() {
        System.out.println(SubMenuEntry_1_Head);
        System.out.println(SubMenuEntry_1_1);
        System.out.println(SubMenuEntry_1_2);
        System.out.println(backToMainMenu);
        System.out.println(appExit);
    }

        /*Подменю 2. Поставки физ. лицам*/
    private void printSubMenu_2() {
        System.out.println(SubMenuEntry_2_Head);
        System.out.println(SubMenuEntry_2_1);
        System.out.println(SubMenuEntry_2_2);
        System.out.println(backToMainMenu);
        System.out.println(appExit);
    }

        /*Подменю 3. Поставки юр. лицам*/
    private void printSubMenu_3() {
        System.out.println(SubMenuEntry_3_Head);
        System.out.println(SubMenuEntry_3_1);
        System.out.println(SubMenuEntry_3_2);
        System.out.println(backToMainMenu);
        System.out.println(appExit);
    }

        /*Подменю 4. Ассортимент*/
    private void printSubMenu_4() {
        System.out.println(SubMenuEntry_4_Head);
        System.out.println(SubMenuEntry_4_1);
        System.out.println(SubMenuEntry_4_2);
        System.out.println(backToMainMenu);
        System.out.println(appExit);
    }

    /*Функции меню*/
        /*Главное меню*/
    public void startMainMenu() {
//        if (this.scanner != null) {
        int key;
//            do {
        printMainMenu();
        System.out.print("Введите номер меню: ");
        key = this.scanner.nextInt();
        switch (key) {
            case 1:
                startSubMenu1();
                break;
            case 2:
                startSubMenu2();
                break;
            case 3:
                startSubMenu3();
                break;
            case 4:
                startSubMenu4();
                break;
            case 5:
                System.out.println("Выход");
                break;
            default:
                System.out.println("Вы ввели неверное значение меню...\n");

        }
//        while(key !=5);
//    }
//}
//    }
    }

        /*Подменю 1*/
    public void startSubMenu1() {
        int key;
        printSubMenu_1();
        System.out.print("Выберете: ");
        key = this.scanner.nextInt();

        switch (key) {
            case 1:
                Postavshiki_V_Sklad_Ser.readSkladPostData();
                break;
            case 2:
                Postavshiki_V_Sklad_Ser.writeSkladPostData();
                break;
            case 3:
                startMainMenu();
                break;
            case 4:
                break;
        }
    }

    /*Подменю 2*/
    public void startSubMenu2() {
        int key;
        printSubMenu_2();
        System.out.print("Выберете: ");
        key = this.scanner.nextInt();

        switch (key) {
            case 1:
                Postavshiki_FZ_Ser.readFZPostData();
                break;
            case 2:
                Postavshiki_FZ_Ser.writeFZPostData();
                break;
            case 3:
                startMainMenu();
                break;
            case 4:
                break;
        }
    }

    /*Подменю 3*/
    public void startSubMenu3() {
        int key;
        printSubMenu_3();
        System.out.print("Выберете: ");
        key = this.scanner.nextInt();

        switch (key) {
            case 1:
                Postavshiki_UR_Ser.readURPostData();
                break;
            case 2:
                Postavshiki_UR_Ser.writeURPostData();
                break;
            case 3:
                startMainMenu();
                break;
            case 4:
                break;
        }
    }

    /*Подменю 4*/
    public void startSubMenu4() {
        int key;
        printSubMenu_4();
        System.out.print("Выберете: ");
        key = this.scanner.nextInt();

        switch (key) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                startMainMenu();
                break;
            case 4:
                break;
        }
    }

}

