package com.logger;

import java.io.*;

public class PostavkiVSklad  implements Serializable{
    public static void main(String[] args) {
        Postavshiki ps1 = new Postavshiki();
        ps1.setAll();
        System.out.println(ps1.getAll());

        // запись объекта в файл
        try {
            FileOutputStream fos = new FileOutputStream(new File("Postavshiki.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Запись объектов в файл
            oos.writeObject(ps1);
            oos.close();
            fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        // Чтение объектов из файла
        try{
            FileInputStream fis = new FileInputStream(new File("Postavshiki.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Postavshiki s1 = (Postavshiki) ois.readObject();
            System.out.println(s1.toString());
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

}
