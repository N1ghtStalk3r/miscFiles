package com.warehouse.notes.postavki_UR;

import java.io.*;

public class Postavshiki_UR_Ser implements Serializable {

    public static void readURPostData() {
        // Чтение объектов из файла
        try {
            FileInputStream fis = new FileInputStream(new File("postavki_UR.dat"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Postavshiki_UR_Data s1 = (Postavshiki_UR_Data) ois.readObject();
            System.out.println(s1.toString());
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeURPostData() {
        // запись объекта в файл
        Postavshiki_UR_Data URPost = new Postavshiki_UR_Data();
        URPost.setAll();
        System.out.println(URPost.getAll());
        try {
            FileOutputStream fos = new FileOutputStream(new File("postavki_UR.dat"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Запись объектов в файл
            oos.writeObject(URPost);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}