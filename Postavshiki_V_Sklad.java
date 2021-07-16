package com.postavki;

import java.io.*;
import java.util.Scanner;

public class Postavshiki_V_Sklad implements Serializable {

    public static void readData() {
        // Чтение объектов из файла
        try {
            FileInputStream fis = new FileInputStream(new File("Postavshiki_V_Sklad.dat"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Postavshiki_V_Sklad_Data s1 = (Postavshiki_V_Sklad_Data) ois.readObject();
            System.out.println(s1.toString());
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeData() {
        // запись объекта в файл
        Postavshiki_V_Sklad_Data postavshik = new Postavshiki_V_Sklad_Data();
        postavshik.setAll();
        System.out.println(postavshik.getAll());
        try {
            FileOutputStream fos = new FileOutputStream(new File("Postavshiki_V_Sklad.dat"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Запись объектов в файл
            oos.writeObject(postavshik);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void menu(){
        String
            menu = "\t\tГлавное меню\n",
            str1 = "1. Запись данных\n",
            str2 = "2. Чтение данных\n",
            choice = "Выберете: ";

        System.out.println(menu + str1 + str2 + choice);

        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();



        switch (x){
            case 1:
                writeData();
                break;
            case 2:
                readData();
                break;
        }

    }

}
