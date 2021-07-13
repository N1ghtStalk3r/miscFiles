package com.logger;
import java.io.*;
import java.util.Scanner;

public class Postavshiki implements Serializable {
    private String nazvanie_kompanii;
    private String nomer_telefona;
    private String email;
    private String region;
    private String gorod;
    private String adres;

    private final String setNK = "Название компании: ";
    private final String setNT=  "Номер телефона: ";
    private final String setEmail = "email: ";
    private final String setRegion = "Регион: ";
    private final String setGorod = "Город: ";
    private final String setAdres = "Адрес: ";

    private static final long serialVersionUID = 3141425254353543L;

    Scanner in = new Scanner(System.in);
    String tmp;

    public String getNazvanie_kompanii() {
        return nazvanie_kompanii;
    }
    public void setNazvanie_kompanii() {
        System.out.print(setNK);
        tmp = in.nextLine();
        this.nazvanie_kompanii = tmp;
    }

    public String getNomer_telefona() {
        return nomer_telefona;
    }
    public void setNomer_telefona() {
        System.out.print(setNT);
        tmp = in.nextLine();
        this.nomer_telefona = tmp;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail() {
        System.out.print(setEmail);
        tmp = in.nextLine();
        this.email = tmp;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion() {
        System.out.print(setRegion);
        tmp = in.nextLine();
        this.region = tmp;
    }

    public String getGorod() {
        return gorod;
    }
    public void setGorod() {
        System.out.print(setGorod);
        tmp = in.nextLine();
        this.gorod = tmp;
    }

    public String getAdres() {
        return adres;
    }
    public void setAdres() {
        System.out.print(setAdres);
        tmp = in.nextLine();
        this.adres = tmp;
    }

    public Postavshiki getAll(){
        return this;
    }
    public void setAll(){
        setNazvanie_kompanii();
        setNomer_telefona();
        setEmail();
        setRegion();
        setGorod();
        setAdres();
    }

    @Override
    public String toString() {
        return "Postavshiki{" +
                "nazvanie_kompanii='" + nazvanie_kompanii + '\'' +
                ", nomer_telefona='" + nomer_telefona + '\'' +
                ", email='" + email + '\'' +
                ", region='" + region + '\'' +
                ", gorod='" + gorod + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
