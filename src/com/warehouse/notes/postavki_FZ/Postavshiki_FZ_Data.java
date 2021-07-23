package com.warehouse.notes.postavki_FZ;

import java.io.Serializable;
import java.util.Scanner;

public class Postavshiki_FZ_Data implements Serializable {
    private String fullName;
    private String phone;
    private String email;
    private String region;
    private String city;
    private String address;

    private final String setfullName = "ФИО: ";
    private final String setPhone =  "Номер телефона: ";
    private final String setEmail = "email: ";
    private final String setRegion = "Регион: ";
    private final String setCity = "Город: ";
    private final String setAddress = "Адрес: ";

    private static final long serialVersionUID = 1L;

    transient Scanner in = new Scanner(System.in);
    String tmp;

    public String getFullName() {
        return fullName;
    }
    public void setFullName() {
        System.out.print(setfullName);
        tmp = in.nextLine();
        this.fullName = tmp;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone() {
        System.out.print(setPhone);
        tmp = in.nextLine();
        this.phone = tmp;
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

    public String getCity() {
        return city;
    }
    public void setCity() {
        System.out.print(setCity);
        tmp = in.nextLine();
        this.city = tmp;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress() {
        System.out.print(setAddress);
        tmp = in.nextLine();
        this.address = tmp;
    }

    public Postavshiki_FZ_Data getAll(){
        return this;
    }
    public void setAll(){
        setFullName();
        setPhone();
        setEmail();
        setRegion();
        setCity();
        setAddress();
    }

    @Override
    public String toString() {
        return String.format("ФИО: |%50s| Тел.: |%11s| Email: |%30s| Регион: |%30s| Город: |%10s| Адрес: |%30s|",
                getFullName(), getPhone(), getEmail(), getRegion(), getCity(), getAddress());
    }
}
