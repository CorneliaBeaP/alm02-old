package com.example.alm02corneliapmalcolmr;

public class Person {

    private String firstName;
    private String lastName;
    private String haircolor;
    private int shoesize;
    private String zodiacSign;
    private int currentPartners;

    public Person(String firstName, String lastName, String haircolor, int shoesize, String zodiacSign, int currentPartners) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.haircolor = haircolor;
        this.shoesize = shoesize;
        this.zodiacSign = zodiacSign;
        this.currentPartners = currentPartners;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public int getShoesize() {
        return shoesize;
    }

    public void setShoesize(int shoesize) {
        this.shoesize = shoesize;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public int getCurrentPartners() {
        return currentPartners;
    }

    public void setCurrentPartners(int currentPartners) {
        this.currentPartners = currentPartners;
    }
}
