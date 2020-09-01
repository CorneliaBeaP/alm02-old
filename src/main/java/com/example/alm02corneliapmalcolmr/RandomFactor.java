package com.example.alm02corneliapmalcolmr;

import java.util.Random;

public class RandomFactor {

    public String firstNameRandomizer(String input) {
        String result = "";

        if (input.length() <= 3) {
            result = "your dad";
        } else if (input.length() < 5) {
            result = "your mom";

        } else if (input.length() < 6) {
            result = "your high school crush";

        } else if (input.length() < 7) {
            result = "your therapist";

        } else if (input.length() < 8) {
            result = "your best friend";

        } else if (input.length() < 10) {
            result = "your favourite childhood teacher";

        } else if (input.length() < 15) {
            result = "your boss";

        } else {
            result = "your parents";

        }
        return result;
    }

    public String haircolorRandomizer(String input) {
        String result = "";

        if (input.toLowerCase().contains("blue")) {
            result = "noon";
        } else if (input.toLowerCase().contains("brown")) {
            result = "midnight";
        } else if (input.toLowerCase().contains("blond") || input.toLowerCase().contains("white") || input.toLowerCase().contains("yellow")) {
            result = "five o'clock";
        } else if (input.toLowerCase().contains("black")) {
            result = "half past six";
        } else if (input.toLowerCase().contains("pink")) {
            result = "dusk";
        } else if (input.toLowerCase().contains("grey")) {
            result = "dawn";
        } else {
            result = "the darkest hour";
        }

        return result;
    }

    public int shoesizeRandomizer(int input) {
        Random random = new Random();
        int luckyNumber = 0;

        if (input < 36) {
            luckyNumber = random.nextInt(10) + 1;
        } else if (input < 38) {
            luckyNumber = random.nextInt(50) + 11;
        } else if (input < 40) {
            luckyNumber = random.nextInt(5) + 20;
        } else if (input < 42) {
            luckyNumber = random.nextInt(100) * 2;
        } else if (input < 45) {
            luckyNumber = random.nextInt(50) + 2;
        } else {
            luckyNumber = random.nextInt(100);
        }

        return luckyNumber;
    }


}
