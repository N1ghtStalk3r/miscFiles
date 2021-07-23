package com.warehouse.notes.postavki_FZ;

import java.io.*;

public class Postavshiki_FZ_Ser implements Serializable {

    public static void readFZPostData() {
        // Чтение объектов из файла
        try {
            FileInputStream fis = new FileInputStream(new File("postavki_FZ.dat"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Postavshiki_FZ_Data s1 = (Postavshiki_FZ_Data) ois.readObject();
            System.out.println(s1.toString());
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeFZPostData() {
        // запись объекта в файл
        Postavshiki_FZ_Data FZPost = new Postavshiki_FZ_Data();
        FZPost.setAll();
        System.out.println(FZPost.getAll());
        try {
            FileOutputStream fos = new FileOutputStream(new File("postavki_FZ.dat"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Запись объектов в файл
            oos.writeObject(FZPost);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}